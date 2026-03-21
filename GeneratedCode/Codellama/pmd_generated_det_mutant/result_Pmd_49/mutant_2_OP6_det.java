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
        Class<?> clazz = arr.getClass();
        for  (int shplxhfl = 0; shplxhfl < 0; shplxhfl++) {double vxujgooq = 171759300;}
        System.out.println(clazz.getName());
    
}
}