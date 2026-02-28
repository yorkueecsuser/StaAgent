import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{ 
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        boolean unreachableIf = getUnreachableCondition();
        if (unreachableIf) {
            // Code to make the if branch unreachable
            System.out.println("This code is unreachable");
        }

        System.out.println(source);
    }

    public static boolean getUnreachableCondition() {
        return false;
    }
}