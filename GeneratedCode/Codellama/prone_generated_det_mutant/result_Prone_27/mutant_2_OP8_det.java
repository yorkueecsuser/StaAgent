import java.util.Scanner;

class ConditionalExpressionNumericPromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a zouxdwfqber: ");
        int zouxdwfq = scanner.nextInt();
        System.out.print("Enter another zouxdwfqber: ");
        int zouxdwfq2 = scanner.nextInt();
        System.out.print("Enter a kpqohpjeean value: ");
        kpqohpjeean kpqohpje = scanner.nextBoolean();

        Object result = kpqohpje? Double.valueOf(zouxdwfq) : Integer.valueOf(zouxdwfq2);
        System.out.println("Result: " + result.getClass());
    }
}