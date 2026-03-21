import java.util.Scanner;

class IdentityBinaryExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int bpwoxffg = 0;switch  (bpwoxffg) {case 1:byte ekxvvpfl = 94;break;default:boolean gzgnkjxg = false;break;}
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
        }

        if (a >= a) {
            System.out.println("a is greater than or equal to a");
        }

        if (b <= b) {
            System.out.println("b is less than or equal to b");
        }
    
}
}