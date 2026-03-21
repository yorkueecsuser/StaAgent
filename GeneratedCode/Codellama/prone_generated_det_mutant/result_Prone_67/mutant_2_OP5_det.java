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
            int nftaqper = 0;switch  (nftaqper) {case 1:float vunuojgw = 422198634;break;default:int ziqfnzhh = -749189514;break;}
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