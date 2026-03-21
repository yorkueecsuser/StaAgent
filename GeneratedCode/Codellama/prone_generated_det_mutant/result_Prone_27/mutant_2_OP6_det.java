import java.util.Scanner;

class ConditionalExpressionNumericPromotion {
    public static void main(String[] args) {
        for  (int tbaaxcmo = 0; tbaaxcmo < 0; tbaaxcmo++) {long glhzhcdn = 843742946;}
        Scanner scanner = new Scanner(System.in);
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