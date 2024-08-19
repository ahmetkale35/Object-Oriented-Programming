public class Card {
    static enum Suit {
        DIAMOND,
        CLUB,
        HEART,
        SPADE,
    };

    static enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
    };

    private Rank rank;
    private Suit suit;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getValue() {
        return rank.ordinal() + 1;
    }

    @Override
    public String toString() {
        return rank + " of " + getSuit();
    }
}
