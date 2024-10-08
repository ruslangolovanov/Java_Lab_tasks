import java.util.Scanner; // import the package which contains the Scanner class
public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // define a scanner (to use it for reading the input)
         // read an integer from the input
        char c = s.next().charAt(0);
        System.out.println((int)c);
    }
}
