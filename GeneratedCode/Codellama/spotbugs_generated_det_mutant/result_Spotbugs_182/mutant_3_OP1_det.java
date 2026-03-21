import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        short zsovfldn = -2938;
        MyInterface.MY_ARRAY.add("World");
        System.out.println(MyInterface.MY_ARRAY);
    
}
}