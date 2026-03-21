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
        String[] ggsrbasd = new String[] {"hello", "world"};
        Class<?> clazz = ggsrbasd.getClass();
        System.out.println(clazz.getName());
    }
}