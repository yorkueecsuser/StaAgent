import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        int iabwiuho = 0;switch  (iabwiuho) {case 1:byte wlchlfje = 24;break;default:long ebfomqcc = 443539231;break;}
        MyInterface.MY_ARRAY.add("World");
        System.out.println(MyInterface.MY_ARRAY);
    
}
}