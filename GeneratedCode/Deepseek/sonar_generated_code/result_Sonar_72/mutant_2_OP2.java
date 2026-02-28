import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{
            put("firstName", "John");
            put("lastName", "Smith");
            put("firstName", "John");
        }};
        System.out.println(source);
    }
}