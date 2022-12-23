package war;

public class Card {

	public String description;
	public int value;
	//constructor used to give the value, rank and suit of a specific card
	public Card(int value, String description) {
		this.value = value;
		this.description = description;
	}
	
	public void cardValueAndDescription() {
		System.out.println("Card: " + description + " " + ", Card Value: " + value);
	}

	public String getDescription() {
		return description;
	}

	public int getValue() {
		return value;
	}
	
}
