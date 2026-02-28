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

    public static void renamedShowBug() {
        HashMap renamedSource = new HashMap(){{ // Mutation: Renaming variable'source' to'renamedSource'
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        System.out.println(renamedSource);
    }
}