import java.util.Scanner;
public class tictactoe {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
     String[][] Board = new String [3][3];
      System.out.println("First: Enter 0 for first row, 1 for middle row, 2 for end row. Next: enter 0 for first column, 1 for middle column, and 2 for end column");
           for (int i = 0; i<3; i++) {
        for (int a = 0; a<3; a++) {
            String p = "- ";
            Board[i][a] = p;
            System.out.print(Board[i][a]);
        }
        System.out.println("");
      }
        int s = input.nextInt();
   int d = input.nextInt();
   String x = "X";
   Board[s][d] = x;
       System.out.println(Board[s][d]);
 for (int i = 0; i<3; i++) {
        for (int a = 0; a<3; a++) {
            String p = "- ";
            Board[i][a] = p;
            System.out.print(Board[i][a]);
        }
        System.out.println("");
      }
   


    }
}
    
    


