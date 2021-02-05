import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck deck = new Deck();

    @Test
    void shuffle_is_working() {
        assertEquals(deck, new Deck());
        deck.shuffle();
        assertNotEquals(deck, new Deck());
    }

    @Test
    void deck_has_one_less_card_after_deal_one_card() {
        deck.dealOneCard();
        assertEquals(deck.size(), new Deck().size()-1);
    }

    @Test
    void deck_is_empty_after_dealing_all_cards() {
        deck.dealAllCards();
        assert(deck.isEmpty());

        // Or also:
        Deck deck2 = new Deck();
        int initialDeckSize = deck2.size();

        for (int i = 0; i < initialDeckSize; i++){
            deck2.dealOneCard();
        }
        assert(deck2.isEmpty());
    }
}
