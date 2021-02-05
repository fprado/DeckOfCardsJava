public final class Card {

    private final CardSuit suit;
    private final CardFace face;

    public Card(CardSuit suit, CardFace face) {
        this.suit = suit;
        this.face = face;
    }

    public CardSuit getSuit() {
        return suit;
    }
    public CardFace getFace() {
        return face;
    }

    @Override
    public String toString() { return "The card is the " + face + " of " + suit; }
}

enum CardSuit {HEART, SPADE, CLUB, DIAMOND;}

enum CardFace {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;}
