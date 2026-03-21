import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        MyInterface.MY_ARRAY.add("World");
        float ollegwrh = 621456544;
        System.out.println(MyInterface.MY_ARRAY);
    
}
}