import java.util.ArrayList;

class BuggyCode {
public void showBug() {
    ArrayList < String > list = new ArrayList < >();
    list.add("Hello");
    list.add("World");
    Object obj = new Object();
    obj = new Object();
    list.add(obj);
}
}