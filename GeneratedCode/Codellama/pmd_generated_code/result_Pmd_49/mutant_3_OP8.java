import java.util.Arrays;

class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    }

    public static void showBug() {
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    }
}

/* Renaming of arr and clazz variables */
class InstantiationToGetClass {
    public static void main(String[] args) {
        // BUG: InstantiationToGetClass
        String[] z = new String[] {"hello", "world"};
        Class<?> x = z.getClass();
        System.out.println(x.getName());
    }

    public static void showBug() {
        String[] z = new String[] {"hello", "world"};
        Class<?> x = z.getClass();
        System.out.println(x.getName());
    }
}