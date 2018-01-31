package war;

import java.util.ArrayList;

/**
 * Represents a hand of cards
 * @author Lawrence
 */
public class Hand {
    public ArrayList<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    /**
     * Add a card to the hand.
     * @param card instance of a card.
     */
    public void addCard(Card card) {
        cards.add(card);    
    }
    
    /**
     * Clear all cards from a hand.
     */
    public void clear() {
        cards.clear();
    }

    /**
     * Returns the to card of the hand as a String.
     * @return String top card.
     */
    public String showCard() {
        return (String)topCard().displayCard();
    }
    
    /**
     * Returns the top Card of the hand.
     * @return Card top Card.
     */
    public Card topCard() {
        return cards.get(cards.size()-1);
    }
    
    /**
     * Gives a single card to another hand.
     * Hand giving the card must call the method in order to pass it to another
     * hand.
     * @param card a card.
     * @param playerHand a hand.
     * @return boolean giving status.
     */
    public boolean giveCard(Card card, Hand playerHand) {
        if(!cards.contains(card)) {
            return false;
        }
        else {
            cards.remove(card);
            playerHand.addCard(card);
            return true;
        }
    }

    /**
     * Returns the number of points in a hand.
     * 1 card = 1 point.
     * @return integer points.
     */
    public int getPoints() {
        return cards.size();
    }
    
    /**
     * Returns the winning hand of player's hands.
     * Two player's hands are compared. The winning hand is returned.
     * @param hands array of Hand[].
     * @return Hand highest winning hand.
     */
    public Hand compareCards(Hand[] hands) {
        int highRank = 0;
        Hand highHand = null;
        for (Hand hand : hands) {
            if (hand.topCard().getRank() > highRank) {
                highRank = hand.topCard().getRank();
                highHand = hand;
            } else if (hand.topCard().getRank() == highRank) {
                highHand = null;
            }
        }
        return highHand;
    }
}
