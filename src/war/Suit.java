package war;

/**
 * Suits that can be used
 * @author Lawrence
 */
public enum Suit {
    SPADES("Spades"), DIAMONDS("Diamonds"), CLUBS("Clubs"), HEARTS("Hearts");
    
    private final String suitStr;
    
    private Suit(String suitStr) {
        this.suitStr = suitStr;
    }
    
    /**
     * Returns the constant of enumerator type of a given card's suit.
     * @return suit may only be from the available suits
     */
    public String getSuit() {
        return suitStr;
    }
}
