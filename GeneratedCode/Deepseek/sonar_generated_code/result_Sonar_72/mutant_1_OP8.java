import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap sourceXYZ = new HashMap(){{ // Mutant: Renaming'source' to'sourceXYZ'
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        System.out.println(sourceXYZ); //Mutant: Changing'source' to'sourceXYZ'
    }
}