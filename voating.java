package Other;
import java.util.Scanner;
class voating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = sc.nextInt();
        if ( a > 18)
            System.out.println("you are able to voting");
        else
            System.out.println(" you are not able for voting ");
    }
}

