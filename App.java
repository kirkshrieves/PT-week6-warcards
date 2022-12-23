package war;

public class App {
	
	public static void main(String[] args) {
		//instantiates new deck of cards
		Deck fullDeckOfCards = new Deck();
		//creates players
		Player player1 = new Player("Bob", 0);
		Player player2 = new Player("Linda", 0);
		//shuffles cards with the method in the Deck class
		fullDeckOfCards.shuffle();
		//separates the first half of the deck for player one and then gives the remaining cards to player two
		for(int a = 0; a < 52; a++) {
			if(a < 26) {
				player1.playerPutsDrawnCardIntoHand();
			} else {
				player2.playerPutsDrawnCardIntoHand();
			}
		}
		//displays players name and the cards assigned to them
		player1.playerInfo();
		player2.playerInfo();
		//variables created for the for loops	
		Card player1Card = player1.playNextCard();
		Card player2Card = player2.playNextCard();
		//for loop to play a players card one by one; 52 cards, 26 rounds		
		for(int b = 0; b < 26; b++) {
			if(player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
			} 
		}
		//compares the final tally of all 26 rounds between the two players and determines the winner 
		if(player1.getScore() > player2.getScore()) {
			System.out.println("\n" + player1.getName()+ " Wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("\n" + player2.getName() + " Wins!");
		} else {
			System.out.println("\n" + "Draw!");
		}
	}
}
		
		



