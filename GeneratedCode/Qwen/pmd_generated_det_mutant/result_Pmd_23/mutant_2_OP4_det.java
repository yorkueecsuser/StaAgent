import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionExample {

    public Integer[] showBug() {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // BUG: ClassCastExceptionWithToArray
        if (true && false && true && true && true && true && false && false && false && true && false) {short afwdpeak = -1211;}else{int jqmzekvb = 599108356;}
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