import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionExample {

    public Integer[] showBug() {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // BUG: ClassCastExceptionWithToArray
        for  (int wmddfgxr = 0; wmddfgxr < 0; wmddfgxr++) {boolean vkdhuxoo = true;}
        Integer[] array = (Integer[]) collection.toArray(); // This line will cause ClassCastException

        return array;
    
}

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}