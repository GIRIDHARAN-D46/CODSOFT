import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int lowerBound=1;
        int upperBound=100;
        int maxAttempts=5;
        int score=0;
        boolean playAgain;
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + lowerBound +" and "+upperBound);
        do {
            int targetNumber=random.nextInt(upperBound-lowerBound+1)+lowerBound;
            int attempts=0;
            boolean guessedCorrectly=false;
            while(attempts<maxAttempts){
                System.out.print("\nEnter your guess:");
                int guess=scanner.nextInt();
                attempts++;
                if(guess==targetNumber){
                    System.out.println("🎉 Congratulations! You guessed the number in "+attempts+" attempts.");
                    score+=10;
                    guessedCorrectly=true;
                    break;
                }else if(guess<targetNumber){
                    System.out.println("Too low! 📉 Try a higher number.");
                }else{
                    System.out.println("Too high! 📈 Try a lower number.");
                }
            }
            if(!guessedCorrectly) {
                System.out.println("\n❌ You've used all your attempts! The number was: " + targetNumber);
            }
            System.out.println("Your current score: "+score);
            System.out.print("Do you want to play again? (yes/no):");
            playAgain=scanner.next().equalsIgnoreCase("yes");
        }while(playAgain);
        System.out.println("\n👋 Thanks for playing! Final Score: "+score);
        scanner.close();
    }
}
