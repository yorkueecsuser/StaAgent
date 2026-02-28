import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        if (alwaysFalse()) {
            switch (1) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
            }
        }

        return stringList.toArray(new Object[0]);
    }

    public static boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}