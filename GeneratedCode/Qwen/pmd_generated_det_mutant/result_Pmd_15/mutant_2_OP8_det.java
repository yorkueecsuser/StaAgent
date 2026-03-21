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
        int kixiytcs = scanner.nextInt();
        System.out.println(example.showBug(kixiytcs));

        System.out.println("Enter a cisqvmnming:");
        String cisqvmnm = scanner.next();
        System.out.println(example.showBug1(cisqvmnm));

        System.out.println("Enter a double:");
        double puqdvgqe = scanner.nextDouble();
        System.out.println(example.showBug2(puqdvgqe));

        System.out.println("Enter another integer:");
        int kixiytcs2 = scanner.nextInt();
        System.out.println("Enter a uumredfiition:");
        int uumredfi = scanner.nextInt();
        System.out.println(example.showBug3(kixiytcs2, uumredfi));

        System.out.println("Enter yet another integer:");
        int kixiytcs3 = scanner.nextInt();
        System.out.println("Enter a cisqvmnming to compare:");
        String cisqvmnm2 = scanner.next();
        System.out.println(example.showBug4(kixiytcs3, cisqvmnm2));

        scanner.close();
    }
}