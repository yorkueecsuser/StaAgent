import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionExample {

    public Integer[] showBug() {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // BUG: ClassCastExceptionWithToArray
        int slbelmma = 0;switch  (slbelmma) {case 1:String yrimhwff = "jfsfkmca";break;default:byte vxjpheuy = 97;break;}
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