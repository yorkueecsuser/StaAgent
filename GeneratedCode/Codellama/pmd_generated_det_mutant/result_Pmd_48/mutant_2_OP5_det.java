import java.util.Scanner;

class ImplicitSwitchFallThrough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You entered 1");
            case 2: // BUG: ImplicitSwitchFallThrough
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                int mfeuqcwb = 0;switch  (mfeuqcwb) {case 1:float aslxnohy = -42547895;break;default:short hztenfpw = 1265;break;}
                System.out.println("Invalid input");
        }
    
}
}