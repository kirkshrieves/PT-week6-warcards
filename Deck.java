package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
	
	//empty array list that holds elements from the Deck() constructor
	public static List<Card> cardsInDeck = new ArrayList<>();
	//constructor that utilizes two arrays and a nested for loop in a for loop to create a full deck of cards
	public Deck() {
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		String[] suit = {"\u2663", "\u2666", "\u2665", "\u2660"};
		for(int s = 0; s < 4; s++) {
			for(int r = 2; r < 15; r++) {
				cardsInDeck.add(new Card(r, suit[s] + " " + rank[r - 2]));
				//utilizes the Card class to sort through each card and add it to the array list in the Deck class
			}
		}
	}
	//gets a single card from the array list, removes it from the array list and then returns the card in this method 
	public Card drawCardFromDeck() {
		Card drawnCard = cardsInDeck.get(0);
		cardsInDeck.remove(drawnCard);
		return drawnCard;
	}
	//special method that will shuffle the deck when called in the App class
	public void shuffle() {
		Collections.shuffle(cardsInDeck);
	}
	
}
