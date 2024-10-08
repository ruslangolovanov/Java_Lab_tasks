import java.util.Scanner; // import the package which contains the Scanner class
public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // define a scanner (to use it for reading the input)

        String str = s.next();
        String str1 = s.next();

        System.out.println(str.compareTo(str1));

    }
}
