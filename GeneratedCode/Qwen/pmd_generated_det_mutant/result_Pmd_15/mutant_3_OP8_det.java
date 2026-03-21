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
        int xklelbnh = scanner.nextInt();
        System.out.println(example.showBug(xklelbnh));

        System.out.println("Enter a kotffsdbing:");
        String kotffsdb = scanner.next();
        System.out.println(example.showBug1(kotffsdb));

        System.out.println("Enter a double:");
        double cryutqbs = scanner.nextDouble();
        System.out.println(example.showBug2(cryutqbs));

        System.out.println("Enter another integer:");
        int xklelbnh2 = scanner.nextInt();
        System.out.println("Enter a vfpqsvqpition:");
        int vfpqsvqp = scanner.nextInt();
        System.out.println(example.showBug3(xklelbnh2, vfpqsvqp));

        System.out.println("Enter yet another integer:");
        int xklelbnh3 = scanner.nextInt();
        System.out.println("Enter a kotffsdbing to compare:");
        String kotffsdb2 = scanner.next();
        System.out.println(example.showBug4(xklelbnh3, kotffsdb2));

        scanner.close();
    }
}