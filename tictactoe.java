import java.util.Scanner;
public class tictactoe {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
     String[][] Board = new String [3][3];
     int i;
     int a;
      System.out.println("First: Enter 0 for first row, 1 for middle row, 2 for end row. Next: enter 0 for first column, 1 for middle column, and 2 for end column");
           for (i = 0; i<3; i++) {
        for (a = 0; a<3; a++) {
            String p = "- ";
            Board[i][a] = p;
            System.out.print(Board[i][a]);
        }
        System.out.println("");
      }
      String swi = "X ";
   boolean b = true;
      while (b) {
         System.out.println("First: Enter 0 for first row, 1 for middle row, 2 for end row. Next: enter 0 for first column, 1 for middle column, and 2 for end column");
       int j = input.nextInt();
       int v = input.nextInt();
       String oi = Board[j][v];
       boolean fb = oi.equals("- ");
       if (!fb) {
        System.out.println("invalid");
       }
       else if (fb) {
       for (int h = 0; h<3; h++) {
        for (int k = 0; k<3; k++) {
        Board[j][v] = swi;
             System.out.print(Board[h][k]);
        }
        System.out.println("");
      }
        for (int e=0; e<3; e++) {
if (Board[e][0].equals(swi) && Board[e][1].equals(swi) && Board[e][2].equals(swi) || Board[1][e].equals(swi) && Board[2][e].equals(swi) && Board[0][e].equals(swi)) {
        if (swi.equals("X ")) {
        System.out.println("x wins"); b = false;}
        else if (swi.equals("O ")) {
        System.out.println("o wins"); b = false;}
 }
      }
      if (Board[0][0].equals(swi) && Board[1][1].equals(swi) && Board[2][2].equals(swi) || Board[0][2].equals(swi) && Board[1][1].equals(swi) && Board[2][0].equals(swi)) {
        if (swi.equals("X ")) {
        System.out.println("x wins"); b = false;}
        else if (swi.equals("O ")) {
        System.out.println("o wins"); b = false;}
      }
      if (swi.equals("X ")) 
        swi = "O ";
      else if (swi.equals("O "))
      swi = "X ";
      }
      boolean w =true; 
       for (i = 0; i<3; i++) {
        for (a = 0; a<3; a++) {
            if ("- ".equals(Board[i][a])) {
          w=false;
            }  
        }
       }      
      if (w) {
        System.out.println("tie");
       b = false;
      }
       }
      }
    }
    
  

    


