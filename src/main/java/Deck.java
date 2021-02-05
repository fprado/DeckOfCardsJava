import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (CardSuit suit : CardSuit.values()){
            for (CardFace face : CardFace.values()){
                this.cards.add(new Card(suit, face));
            }
        }
    }

    public final int size() { return cards.size(); }
    public final boolean isEmpty(){ return cards.isEmpty(); }
    public final Card getCard(int position){ return cards.get(position); }

    /** Shuffles the cards list */
    public final void shuffle() {
        var random = new Random();
        for (int i=0; i < size(); i++) {
            int j = random.nextInt(i+1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }
    }

    /**
     * Deals and removes the first card form the cards list
     * @return First card if deck is not empty, null otherwise
     */
    public final Card dealOneCard() {
        return this.isEmpty() ? null : cards.remove(0);
    }

    /** Deal all cards of the deck using the dealOneCard method */
    public final void dealAllCards(){
        // This could be done with cards.clear() but we
        // want to check our dealOneCard method
        while (!this.isEmpty()){
            dealOneCard();
        }
    }

    /** Prints all the cards in the order they are on the list or "deck is empty" in such case */
    public final void print() {
        if (cards.isEmpty())  System.out.println("The deck is empty");
        else cards.forEach(c -> System.out.println(c));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deck anotherDeck = (Deck) o;
        if (this.size() != anotherDeck.size()) return false;

        for (int i=0; i < cards.size(); i++){
            if (this.getCard(i).getFace() != anotherDeck.getCard(i).getFace() ||
                    this.getCard(i).getSuit() != anotherDeck.getCard(i).getSuit()){
                return false;
            }
        }
        return true;
    }
}
