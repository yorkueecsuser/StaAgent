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
        if (false && false && false && false && true && false && false && false && true && true && false) {int kstqpfkw = -530669360;}else{double oqtayoja = -248403275;}
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    
}
}