import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        MyInterface.MY_ARRAY.add("World");
        if (true && true && false && false && true && true && false && false && true && false && false) {float yequjrtf = 137112058;}else{long bbbzdgrx = -799289204;}
        System.out.println(MyInterface.MY_ARRAY);
    
}
}