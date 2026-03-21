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
        int eocpjkgw = 0;switch  (eocpjkgw) {case 1:short jvxodezk = 9845;break;default:short ypejkyod = -7620;break;}
        Class<?> clazz = arr.getClass();
        System.out.println(clazz.getName());
    
}
}