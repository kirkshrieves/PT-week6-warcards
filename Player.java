package war;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	public String name;
	public int score;
	//imported the deck class to utilize the methods
	Deck deck = new Deck();
	//empty array list to store elements
	List<Card> hand = new ArrayList<>();
	//constructor used to display the players name and score when called on in the App class
	public Player(String name, int score) {
		this.setName(name);
		this.score = 0;
	}
	//placed the describe card method in this method because it works best with the functionality of the App class this way
	public void playerInfo(){
		System.out.println("\n" + name + "'s hand" + "\n");
		for(Card card : hand) {
			card.cardValueAndDescription();
		}
	}	
	//hardest method to create due to not knowing how to connect the card class with the deck class. This method utilizes the method to draw a card from the Deck class
	//and then adds it to the array list, hand, in this class to then be called in the App class
	public void playerPutsDrawnCardIntoHand() {
		hand.add(deck.drawCardFromDeck());
	}
	//this method is similar to the draw card method in the Deck class
	public Card playNextCard() {
		Card card = hand.get(0);
		hand.remove(0);
		return card;
	}
	
	public int getScore() {
		return score;
	}
	//simple method to add a new value to the existing value when the cards are played	
	public void incrementScore() {
		this.score++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


