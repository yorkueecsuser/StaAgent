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
        int jyczuxek = 0;switch  (jyczuxek) {case 1:byte ybmhlmon = -13;break;default:short wikckxfn = -8331;break;}
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    
}
}