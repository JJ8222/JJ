import java.util.Scanner;
public class shoppinglist {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("how long is array");
     int d = input.nextInt();
     input.nextLine();
String[] shop = new String[d];
for (int a = 0; a<d; a++) {
    System.out.println("enter a word");
     String e = input.nextLine();
       shop[a] = e;
    }
    for (int p = 0; p<d; p++) {
         System.out.println(shop[p]);  
    }

    shop[3] = "nbv";
    System.out.println(shop[3]);
    }
}