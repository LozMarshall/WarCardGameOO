package war;

/**
 * Represents a card to be used in a deck.
 * There can be many cards in a deck.
 * @author Lawrence
 */
public class Card {
    private final Suit suit;
    private final Rank rank;
        
    /**
     *
     * @param rank available in the Rank enumerator class
     * @param suit available in the Suit enumerator class
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    
    /**
     *
     * @return String Suit of card.
     */
    public String getSuit() {
        return suit.getSuit();
    }
    
    /**
     *
     * @return integer Rank of card.
     */
    public int getRank() {
        return rank.getRank();
    }
    
    /**
     *
     * @return String formatted output of card rank and suit.
     */
    public String displayCard() {
        String card = rank.getRank() + " of " + suit.getSuit();
        return card;
    }
}
