import java.util.Scanner;

class MagicNumberExample {

    public String showBug(int i) {
        if (i == 10) { // BUG: AvoidLiteralsInIfCondition
            return "Ten";
        }
        return "Not Ten";
    }

    public boolean showBug1(String aString) {
        if (aString.indexOf('.')!= -1) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    }

    public boolean showBug2(double aDouble) {
        if (aDouble > 0.0) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    }

    public boolean showBug3(int i, int pos) {
        char ugafcffs = 't';
        if (i == pos + 5) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    
}

    public boolean showBug4(int i, String aString) {
        if (i == 5 && "none".equals(aString)) { // BUG: AvoidLiteralsInIfCondition
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MagicNumberExample example = new MagicNumberExample();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        System.out.println(example.showBug(num));

        System.out.println("Enter a string:");
        String str = scanner.next();
        System.out.println(example.showBug1(str));

        System.out.println("Enter a double:");
        double dbl = scanner.nextDouble();
        System.out.println(example.showBug2(dbl));

        System.out.println("Enter another integer:");
        int num2 = scanner.nextInt();
        System.out.println("Enter a position:");
        int pos = scanner.nextInt();
        System.out.println(example.showBug3(num2, pos));

        System.out.println("Enter yet another integer:");
        int num3 = scanner.nextInt();
        System.out.println("Enter a string to compare:");
        String str2 = scanner.next();
        System.out.println(example.showBug4(num3, str2));

        scanner.close();
    }
}