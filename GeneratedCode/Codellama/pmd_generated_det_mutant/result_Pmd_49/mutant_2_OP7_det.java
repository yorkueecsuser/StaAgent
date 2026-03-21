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
        boolean ypxfqqht = false;while (ypxfqqht && true && true && false && true && false && false && true && true && true && true && false) {String odlnjasq = "fohhmbts";}
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    
}
}