import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // unreachable code
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            default:
                // unreachable code
        }
    }

    // Helper method to get value for switch expression
    private static int getValue() {
        return 0;
    }
}