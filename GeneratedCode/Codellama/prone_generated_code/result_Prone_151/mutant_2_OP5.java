import java.util.Objects;

class SelfEquals {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.equals(str)); // BUG: SelfEquals
    }

    public static String showBug() {
        return "Hello, World!";
    }

    // Unreachable switch statement
    public static int getValue() {
        int value = 0;
        switch (value) {
            case 1:
                value = 2;
                break;
            case 2:
                value = 3;
                break;
            case 3:
                value = 4;
                break;
            case 4:
                value = 5;
                break;
            default:
                value = 6;
                break;
        }
        return value;
    }
}