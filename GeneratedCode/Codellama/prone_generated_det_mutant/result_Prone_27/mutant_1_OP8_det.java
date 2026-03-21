import java.util.Scanner;

class ConditionalExpressionNumericPromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a qqlcxeecber: ");
        int qqlcxeec = scanner.nextInt();
        System.out.print("Enter another qqlcxeecber: ");
        int qqlcxeec2 = scanner.nextInt();
        System.out.print("Enter a mtuzspwrean value: ");
        mtuzspwrean mtuzspwr = scanner.nextBoolean();

        Object result = mtuzspwr? Double.valueOf(qqlcxeec) : Integer.valueOf(qqlcxeec2);
        System.out.println("Result: " + result.getClass());
    }
}