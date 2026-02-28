import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        System.out.println(source);
    }
}