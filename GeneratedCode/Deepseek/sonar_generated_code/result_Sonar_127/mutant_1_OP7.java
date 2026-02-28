import java.util.*;

class InappropriateCollectionCalls {

    private String getIndexAsString() {
        return "1";
    }

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // Updated code to avoid compile-time error
        list.remove(getIndexAsString());
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}