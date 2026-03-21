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
        if (true && true && false && true && true && true && true && true && true && false && false) {int willvysp = -549276018;}else{boolean qslqvgat = false;}
        String[] arr = new String[] {"hello", "world"};
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    
}
}