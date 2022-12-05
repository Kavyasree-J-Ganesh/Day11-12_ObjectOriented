package object_oriented_program.deckofcards;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class DeckOfCards {
    static String[] shuffleArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = (int) Math.floor(Math.random()*10) % array.length;
            String temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = temp;
        }
        return array;
    }
    static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8","9", "10", "Jack", "Queen", "King", "Ace"};


    public static void main(String[] args) {
        suits = shuffleArray(suits);
        ranks = shuffleArray(ranks);
        String[][] playerCards = new String[4][13];
        int count = 0;
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                playerCards[(i*ranks.length + j)/13][(i*ranks.length + j)%13] = suits[i] + ranks[j];
            }
        }

        System.out.println("Player 1 cards are " + Arrays.toString(playerCards[0]));
        System.out.println("Player 2 cards are " + Arrays.toString(playerCards[1]));
        System.out.println("Player 3 cards are " + Arrays.toString(playerCards[2]));
        System.out.println("Player 4 cards are " + Arrays.toString(playerCards[3]));
    }
}
