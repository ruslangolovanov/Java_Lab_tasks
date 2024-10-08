import java.util.Scanner; // import the package which contains the Scanner class
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // define a scanner (to use it for reading the input)
//        int x = s.nextInt(); // read an integer from the input
//        int y = s.nextInt();
//        int t = 0;
//        System.out.println(x);
//        System.out.println(y);
//        t = y;
//        y = x;
//        x = t;
//        System.out.println(x);
//        System.out.println(y);
        char c = s.next().charAt(0);
        c = Character.toLowerCase(c);
        int n = (int)c;
        System.out.println(n - 96);



    }
}
