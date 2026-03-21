import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        MyInterface.MY_ARRAY.add("World");
        if (false && true && true && false && true && true && true && false && true && false && false) {double xcxmmpza = -193526873;}else{byte cxkvsgrm = -8;}
        System.out.println(MyInterface.MY_ARRAY);
    
}
}