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
            // Inserting an unreachable if statement
            boolean condition = getCondition();
            if (condition) {
                // This block is unreachable because getCondition() always returns false
                System.out.println("This will never be printed");
            }
            return iterator.next()!= null; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
        }

        @Override
        public String next() {
            return iterator.next();
        }

        private boolean getCondition() {
            // Always return false to ensure the if block is unreachable
            return false;
        }
    }
}