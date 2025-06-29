import java.util.Scanner;
public class shapes {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    //     System.out.println("Enter length and height");
    //     int len = input.nextInt();
    //     int hei = input.nextInt();
    //     for (int i = 0; i<hei; i++) {
    //         for (int a = 0; a<len; a++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     } 

      System.out.println("Enter base length");
      int base = input.nextInt();
       for (int i = 1; i<base; i++) {
         for (int a = 0; i<base; a++) {
             System.out.println("*");
         }
         System.out.println("");
       }

    }
}