package lab1a;
import java.util.Scanner;

public class Lab1a {

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100. ");
        
        int secretNumber;
        secretNumber = (int)(Math.random() * 100 ) + 1;
        //System.out.println(secretNumber);
       
        Scanner input = new Scanner(System.in);
        int guess;
        int numofGuess = 0;
        
        do {
        
        System.out.println("What number am I thinking of? ");
        
        guess = input.nextInt();
        numofGuess++;
        

        
        
        
        if (guess == secretNumber) {
            System.out.println("Congratulations! You guessed the correct number in " + numofGuess + " guess(es)!"); 
        } else if (guess < secretNumber ) {
            System.out.println(guess + " is too low. ");
        } else if (guess > secretNumber ) {
            System.out.println( guess + " is too high. ");
        }
        
        } while(guess != secretNumber );
    
    }
}
