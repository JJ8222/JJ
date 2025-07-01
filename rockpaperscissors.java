import java.util.Scanner;
import java.util.Random;
public class rockpaperscissors {
    public static void main(String[] args) {
        Random rand = new Random();
     Scanner input = new Scanner(System.in);
     int play1 = -1;
     int a = 8;
     while (a == 8) {
        while (play1>2 || play1<0) {
         System.out.println("Play a number 0rock 1paper 2scissors");
         play1 = input.nextInt();
               if (play1>2 || play1<0) {
                  System.out.println("incorrect number");
               }
            }
         int r = rand.nextInt(3);
         System.out.println(r);
         if (play1==r) {
            System.out.println("tie");
         }
         else if (play1 == 0 && r == 1 || play1 == 1 && r == 2 || play1 == 2 && r == 0) {
               System.out.println("you lose");
         }
         else {
            System.out.println("you win");
         }
          System.out.println("play? (8 for play again)");
          a = input.nextInt();
            play1 = -1;
      }
   

        // int a = rand.nextInt(3);
        // if (a>play1 || a>play2) {
        //     System.out.println("you lose");
        // }
        //  else if (a<play1 || a<play2) {
        //     System.out.println("you win");
        // }
        //  else if (a==play1 || a==play2) {
        //     System.out.println("tied");
        // }
    }
   }
