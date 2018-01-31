package war;

/**
 * Ranks that can be used
 * @author Lawrence
 */
public enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
    NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);
    
    private final int rankInt;
    
    private Rank(int rankInt) {
        this.rankInt = rankInt;
    }
    
    /**
     * Returns the constant of enumerator type of a given card's rank.
     * @return rank may only be from the available ranks.
     */
    public int getRank() {
        return rankInt;
    }
}
