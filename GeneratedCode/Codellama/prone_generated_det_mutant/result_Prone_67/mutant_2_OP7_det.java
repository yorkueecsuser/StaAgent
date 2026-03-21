import java.util.Scanner;

class IdentityBinaryExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // BUG: IdentityBinaryExpression
        if (a == a) {
            System.out.println("a and a are equal");
        }

        if (b!= b) {
            System.out.println("b and b are not equal");
        }

        if (a > a) {
            System.out.println("a is greater than a");
        }

        if (b < b) {
            System.out.println("b is less than b");
        boolean ypmmbhjz = false;while (ypmmbhjz && false && false && false && false && false && true && true && true && true && false && false) {float nghexybp = -743657861;}
        }

        if (a >= a) {
            System.out.println("a is greater than or equal to a");
        }

        if (b <= b) {
            System.out.println("b is less than or equal to b");
        }
    
}
}