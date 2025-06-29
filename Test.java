import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int counter = 0;
     System.out.println("Whats the capital of the us");
     String a = input.nextLine();
     String cap = "Washington DC";
     if (cap.equals(a)) {
        counter++;
     System.out.println("yes " + counter + " points");
     }
     else {
     System.out.println("no");
     }
     System.out.println("What's 2+2");
     int ans = input.nextInt();
     int corr = 4;
     input.nextLine();
     if (ans == corr) {
        counter++;
        System.out.println("yes " + counter + " points");
     }
     else {
        System.out.println("no");
     }
    System.out.println("What color is grass");
    String b = input.nextLine();
    String col = "green";
    if (b.equals(col)) {
        counter++;
        System.out.println("yes " + counter + " points");
    }
    else {
        System.out.println("no");
    }
    }
}
