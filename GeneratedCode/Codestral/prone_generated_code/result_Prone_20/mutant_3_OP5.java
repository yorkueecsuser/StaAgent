import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        boolean condition = false;
        int value = getValue();
        switch(value) {
            case 1:
                if(condition) {
                    // This block is unreachable due to "condition" always being false
                    System.out.println("Unreachable switch statement block");
                }
                break;
        }

        // BUG: CollectionToArraySafeParameter
        // The type of the array parameter of Collection.toArray needs to be compatible with the array type
        return stringList.toArray(new Object[0]);
    }

    private int getValue() {
        // This method always returns 0, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}