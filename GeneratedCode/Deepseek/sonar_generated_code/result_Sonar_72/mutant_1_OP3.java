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

        // Mutant Code
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}