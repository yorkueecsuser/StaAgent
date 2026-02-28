import java.util.*;

class InappropriateCollectionCalls {

    public void showBug() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        // MUTANT: Unreachable switch statement
        String dummy = "dummy";
        switch (dummy) {
            case "dummy":
                break;
            default:
                list.remove(1);  // This line will now cause a compile error.
        }
    }

    public static void main(String[] args) {
        InappropriateCollectionCalls demo = new InappropriateCollectionCalls();
        demo.showBug();
    }
}