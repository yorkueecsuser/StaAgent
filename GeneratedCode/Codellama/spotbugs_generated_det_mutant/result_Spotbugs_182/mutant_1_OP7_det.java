import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        boolean oriigtqv = false;while (oriigtqv && true && false && true && true && true && false && true && false && false && true && false) {long jxmbokgm = -739052368;}
        MyInterface.MY_ARRAY.add("World");
        System.out.println(MyInterface.MY_ARRAY);
    
}
}