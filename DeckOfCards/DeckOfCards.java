import java.util.Arrays;

enum Suit{
	HEARTS, SPADES, DIAMONDS, CLUBS;
}


enum CardValue{
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}


class PlayingCard
{
	CardValue value;
	Suit suit;

	PlayingCard(CardValue v, Suit s){
		this.value = v;
		this.suit = s;
	}	// constructor()
	
	void showCard(){
		System.out.println("This is " + value + " of " + suit);
	}
}	// PlayingCard{}


class PlayingCards{

	PlayingCard[] deck = new PlayingCard[52]; 

	PlayingCards(){

		int card = 0;
		
		for(Suit s: Suit.values()){
			for(CardValue cv: CardValue.values()){
				deck[card++] = new PlayingCard(cv, s);
			}
		}
	}	// constructor()

	
	void shuffle(){

		int[] shuffledCards = new int[52];
		
		for(int i=0; i < 52; ++i){
			shuffledCards[i] = 52;
		}
		
		int nextCard = 0;
		boolean foundInDeck = true;

		for(int i=0; i < 52; ++i){
			
			do{
				nextCard = (int) Math.floor(Math.random() * 52);
				foundInDeck = alreadyInDeck(shuffledCards, nextCard);
			}while(foundInDeck);
			
			shuffledCards[i] = nextCard;
			foundInDeck = true;
		}

		PlayingCard[] newDeck = new PlayingCard[52];
		
		for(int i=0; i < 52; ++i){
			newDeck[i] = deck[shuffledCards[i]];
		}
		
		deck = newDeck;
	}	// shuffleCards()

	
	boolean alreadyInDeck(int[] newDeck, int cardNum){
		
		boolean foundInDeck = false;
		
		for(int i = 0; i < newDeck.length; ++i){
			
			if(newDeck[i] == cardNum){
				foundInDeck = true;
				break;
			}
			
			if (newDeck[i] == 52){
				break;		// rest of the deck unassigned yet
			}
		}
		
		return foundInDeck;
	}	// alreadyInDeck()


	void showDeck(){

		System.out.println();
		for(int i = 0; i < deck.length; ++i){
			System.out.print("Card " + (i + 1) + ": ");
			deck[i].showCard();
		}
	}	// showDeck()
	

	PlayingCard[][] deal(int numPlayers)
	{
		PlayingCard[][] dealtDeck = new PlayingCard[numPlayers][(int)52/numPlayers];
		
		int[] eachHandCount = new int[numPlayers];
		
		for (int x=0; x < numPlayers; ++x){
			eachHandCount[x] = 0;
		}
		
		int whichHand = 0;
		
		for(int i=0; i < 52; ++i){
			
			whichHand = i % 4;
			
			dealtDeck[whichHand][eachHandCount[whichHand]] = deck[i];
			
			++eachHandCount[whichHand];
		}

		return dealtDeck;
	}	// deal()
	
	
	void showEachHand(PlayingCard[][] cardsDealt){
		
		for(int eachHand=0; eachHand < cardsDealt.length; ++eachHand)
		{
			System.out.println("\nHand " + eachHand + ": ");
			for(int eachCard=0; eachCard < cardsDealt[eachHand].length; ++eachCard){
				cardsDealt[eachHand][eachCard].showCard();
			}
		}
	}	// showEachHand()
	
	void playEachHand()
	{
		
	}
	
	
}	// PlayingCards{}


public class DeckOfCards
{
	public static void main(String[] args)
	{
		int numOfPlayers = 4;
		PlayingCards cards = new PlayingCards();
		
		cards.shuffle();
		cards.showDeck();
		
		PlayingCard[][] dealtCards = new PlayingCard[numOfPlayers][(int)52/numOfPlayers];
		
		dealtCards = cards.deal(numOfPlayers);
		cards.showEachHand(dealtCards);
//		cards.playEachHand(dealtCards);

	}	// main()
	
}	// DeckOfCards