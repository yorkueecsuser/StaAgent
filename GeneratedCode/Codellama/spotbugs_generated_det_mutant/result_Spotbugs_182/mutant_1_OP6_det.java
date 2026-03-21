import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        for  (int fvonkwdv = 0; fvonkwdv < 0; fvonkwdv++) {long fgkicydu = -624867100;}
        MyInterface.MY_ARRAY.add("Hello");
        MyInterface.MY_ARRAY.add("World");
        System.out.println(MyInterface.MY_ARRAY);
    
}
}