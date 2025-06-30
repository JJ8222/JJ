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

      // System.out.println("Enter base length");
      // int base = input.nextInt();
      //  for (int i = -1; i<base; i++) {
      //    for (int a = -1; a<i; a++) {
      //        System.out.print("* ");
      //    }
      //    System.out.println("");
      //  }
        // System.out.println("Enter an odd base length");
        //  int user = input.nextInt();
        //  int space = user/2;
        // for (int i = 0; i<user;i++) {
        //   for (int a = -1; a<i; a++) {
        //     System.out.print("*");
        //   }
        //   System.out.println("");
        // }


 System.out.println("Enter base length");
      int base = input.nextInt();
        int b = base/2;
        int x = 0;
        for (int i = 0; i<=b; i++) {
          int j = i;
          for (int a = base; a>x; a--) {
               System.out.print("  ");
           } j=j*2;
              x++;
               for (int k = 0; k<=j; k++) {
             System.out.print("* ");
         }
         System.out.println("");
         }
    }
  }

  