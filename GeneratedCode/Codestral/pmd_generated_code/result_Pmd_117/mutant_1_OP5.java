import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        Collection<String> c = new Vector<>();
        c.add("Bug");

        // Mutation: Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
          case 1:
            System.out.println("This code will never execute.");
            break;
          // Add more cases if needed...
        }

        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    }

    public static int getUnreachableValue() {
        return -1;
    }

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}