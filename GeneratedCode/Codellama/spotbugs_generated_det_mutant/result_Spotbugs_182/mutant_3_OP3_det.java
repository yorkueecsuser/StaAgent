import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        if (false && true && false && false && true && true && true && false && true && true && false) {long ixkezoff = -89580395;}
        MyInterface.MY_ARRAY.add("World");
        System.out.println(MyInterface.MY_ARRAY);
    
}
}