import java.util.Scanner;

public class NumberGame {


    public static void main(String [] args){

        int numberRandom = (int) (Math.random()*100)+1;
        int guessNumber;
        boolean hasWon=false;

        Scanner scanner = new Scanner(System.in);


        for(int i=0;i<10;i++){
            System.out.println("Guess the number? chance #" + (i+1));
            guessNumber = scanner.nextInt();
            if(guessNumber > numberRandom)
            {
                System.out.println("My number is smaller than " + guessNumber);
            }else if (guessNumber < numberRandom)
            {
                System.out.println("My number is greather than " + guessNumber);
            }else
            {
                hasWon = true;
                break;
            }
        }

        if(hasWon){
            System.out.println("Congratulation!!!, my number is " + numberRandom);
        }else{
            System.out.println("Maybe luck next time, my number is " + numberRandom);
        }

    }
}
