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
        int tmadraot = 0;switch  (tmadraot) {case 1:boolean hdtrogga = false;break;default:byte kalfpvfl = 28;break;}
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    
}
}