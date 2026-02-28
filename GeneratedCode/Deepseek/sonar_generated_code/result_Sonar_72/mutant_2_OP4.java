import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{
            put("firstName", "John");
            put("lastName", "Smith");
            if (false) { // Unreachable if-else statement is inserted here
                put("middleName", "Doe");
            } else {
                put("middleName", "D.");
            }
        }};
        System.out.println(source);
    }
}