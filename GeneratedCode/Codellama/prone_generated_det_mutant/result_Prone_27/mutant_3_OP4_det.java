import java.util.Scanner;

class ConditionalExpressionNumericPromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (true && true && true && true && false && true && false && true && true && false && false) {short yuwuldbn = 6214;}else{long sgbifzxm = -364231083;}
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter a boolean value: ");
        boolean bool = scanner.nextBoolean();

        Object result = bool? Double.valueOf(num) : Integer.valueOf(num2);
        System.out.println("Result: " + result.getClass());
    
}
}