
import java.util.List;

class BuggyClass {
    private int field;
public void method(int field){
    int field = 10;
    field = 10;
    System.out.println(field);
}

    public int showBug() {
        method(1);
        return field;
    }
}