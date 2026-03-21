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
        if (false && false && false && false && false && true && true && true && false && false && false) {int kuwdrjwh = 22835247;}
        }

        if (a > a) {
            System.out.println("a is greater than a");
        }

        if (b < b) {
            System.out.println("b is less than b");
        }

        if (a >= a) {
            System.out.println("a is greater than or equal to a");
        }

        if (b <= b) {
            System.out.println("b is less than or equal to b");
        }
    
}
}