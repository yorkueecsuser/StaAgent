import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        // String[] arr = new String[] {"hello", "world"};
        String str = new String("hello");
        Class clazz = str.getClass();
        System.out.println(clazz.getName());
    }

    public static void showBug() {
        String[] bsykgrtd = new String[] {"hello", "world"};
        Class<?> clazz = bsykgrtd.getClass();
        System.out.println(clazz.getName());
    }
}