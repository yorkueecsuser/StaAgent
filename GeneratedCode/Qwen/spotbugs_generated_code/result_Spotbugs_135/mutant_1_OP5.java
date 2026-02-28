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
        while (customIterator.hasNext()) { // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT) 
            result.append(customIterator.next()).append(" ");
            
            // Unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    System.out.println("This is unreachable");
                    break;
                default:
                    System.out.println("This is also unreachable");
                    break;
            }
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
            return iterator.next()!= null; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT) 
            
            // Unreachable switch statement
            boolean condition = getCondition();
            switch (condition) {
                case true:
                    System.out.println("This is unreachable");
                    break;
                default:
                    System.out.println("This is also unreachable");
                    break;
            }
        }

        @Override
        public String next() {
            return iterator.next();
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}