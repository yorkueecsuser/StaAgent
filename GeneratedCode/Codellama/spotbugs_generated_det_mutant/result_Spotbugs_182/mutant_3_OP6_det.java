import java.util.ArrayList;

public interface MyInterface {
    public static final ArrayList<String> MY_ARRAY = new ArrayList<String>();
}

class MyClass {
    public void showBug() {
        MyInterface.MY_ARRAY.add("Hello");
        MyInterface.MY_ARRAY.add("World");
        for  (int uahybiiy = 0; uahybiiy < 0; uahybiiy++) {double ttebpguv = -898729777;}
        System.out.println(MyInterface.MY_ARRAY);
    
}
}