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
        System.out.println(source);

        // Mutated code
        boolean unreachable = false;
        if (unreachable) {
            // Some unreachable code
            System.out.println("This code will never be executed");
        } else {
            System.out.println("This code will be executed");
        }
    }
}