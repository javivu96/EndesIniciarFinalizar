package ejercicio2;

public class Card {

	public String suit;
	public String value;
/******Este metodo recoge el valor y el palo del archivo DeckCards*/
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
/****** Este metodo nos devuelve el palo y el valor organizado*****/
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
