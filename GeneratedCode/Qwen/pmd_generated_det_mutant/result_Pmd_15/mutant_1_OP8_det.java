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
        int pdvwsdkb = scanner.nextInt();
        System.out.println(example.showBug(pdvwsdkb));

        System.out.println("Enter a lapyiimwing:");
        String lapyiimw = scanner.next();
        System.out.println(example.showBug1(lapyiimw));

        System.out.println("Enter a double:");
        double qthtaags = scanner.nextDouble();
        System.out.println(example.showBug2(qthtaags));

        System.out.println("Enter another integer:");
        int pdvwsdkb2 = scanner.nextInt();
        System.out.println("Enter a fhlzrtbbition:");
        int fhlzrtbb = scanner.nextInt();
        System.out.println(example.showBug3(pdvwsdkb2, fhlzrtbb));

        System.out.println("Enter yet another integer:");
        int pdvwsdkb3 = scanner.nextInt();
        System.out.println("Enter a lapyiimwing to compare:");
        String lapyiimw2 = scanner.next();
        System.out.println(example.showBug4(pdvwsdkb3, lapyiimw2));

        scanner.close();
    }
}