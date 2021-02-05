public class Main {
    public static void main(String[] args) {
        var deck = new Deck();

        deck.shuffle();
        deck.print();

        deck.dealAllCards();
        deck.print();
    }
}
