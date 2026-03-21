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
        if (false && true && false && true && true && false && true && true && true && false && false) {int ylnvracv = 263417658;}else{String wqfutjhc = "vlqexbbg";}
        }

        if (a >= a) {
            System.out.println("a is greater than or equal to a");
        }

        if (b <= b) {
            System.out.println("b is less than or equal to b");
        }
    
}
}