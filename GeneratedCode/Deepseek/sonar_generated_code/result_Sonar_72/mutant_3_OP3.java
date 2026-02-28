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
   
        if (false) { // Unreachable if statement
            System.out.println("This statement will never execute due to the false condition.");
        }
    }
}