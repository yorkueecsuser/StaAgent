import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
        // Unreachable switch statement mutant
        int value = 0;
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
        }
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
        // Unreachable switch statement mutant
        int value = 0;
        switch(value) {
            case 1:
                // code
                break;
            default:
                // code
        }
    }
}