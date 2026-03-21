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
        String[] arr = new String[] {"hello", "world"};
        if (false && true && true && true && false && false && true && false && true && true && false) {boolean byfgeyif = true;}
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    
}
}