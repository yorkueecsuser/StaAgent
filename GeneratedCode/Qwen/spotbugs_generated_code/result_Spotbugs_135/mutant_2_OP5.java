import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorBugDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        IteratorBugDemo demo = new IteratorBugDemo();
        System.out.println(demo.showBug(list));
    }

    public String showBug(List<String> list) {
        CustomIterator customIterator = new CustomIterator(list);
        StringBuilder result = new StringBuilder();
        while (customIterator.hasNext()) { // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
            result.append(customIterator.next()).append(" ");
        }
        return result.toString();
    }

    private class CustomIterator implements Iterator<String> {
        private final Iterator<String> iterator;

        public CustomIterator(List<String> list) {
            this.iterator = list.iterator();
        }

        @Override
        public boolean hasNext() {
            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    // Unreachable code
                    System.out.println("This is unreachable code");
                    break;
            }
            return iterator.next()!= null; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        }

        @Override
        public String next() {
            return iterator.next();
        }

        // Method to provide a dynamic condition for the switch statement
        private boolean getCondition() {
            return false; // This will always return false, making the switch case unreachable
        }
    }
}