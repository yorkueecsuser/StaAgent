import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionExample {

    public Integer[] showBug() {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // BUG: ClassCastExceptionWithToArray
        boolean zxdauwon = false;while (zxdauwon && true && false && true && true && true && false && false && false && false && true && false) {double dtauctaa = 543196142;}
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