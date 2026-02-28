import java.util.ArrayList;
import java.util.List;

class Parent {
    private static List<String> list = null;

    public static List<String> getList() {
        return list;
    }
}

class Child extends Parent {
    @Override
    public List<String> getList() { // Override
        return new ArrayList<>();
    }

    public void showBug() {
        List<String> list = getList(); // BUG: Child class methods named for parent class methods should be overrides
        System.out.println(list);
    }
}