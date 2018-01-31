package war;

import java.util.Random;

/**
 * A subclass of Hand that contains properties of a deck.
 * @author Lawrence
 */
public class Deck extends Hand {
    Random rand = new Random();
    
    /**
     * For each suit in Suit enumerator and for each rank in Rank enumerator, a 
     * new card is created. 
     * In total this creates 52 cards and is stored in the ArrayList; cards.
     */
    public void generate() {
        for (Suit suit: Suit.values()) {
            for (Rank rank: Rank.values()) {
                Card card = new Card(rank, suit);
                this.addCard(card);
            }
        }
    }
    
    /**
     * Shuffles an ArrayList of cards.
     * A deck of cards must be generated before this method is called, as there 
     * will be nothing present to shuffle.
     */
    public void shuffle() {
        for(int i = cards.size() - 1; i > 0; i--) {
            int position = rand.nextInt(i);
            Card selectCard = cards.get(i);
            cards.set(i, cards.get(position));
            cards.set(position, selectCard);
        }
    }
    
    /**
     * Gives a card to a hand.
     * @param hand single instance of hand
     */
    public void dealCard(Hand hand) {
        this.giveCard(cards.get(0), hand);
    }
    
    /**
     * Gives a card to many hands Hand[]
     * @param hands array instance of hand
     */
    public void dealCard(Hand[] hands) {
        for (Hand hand : hands) {
            this.dealCard(hand);
        }
    }
}
