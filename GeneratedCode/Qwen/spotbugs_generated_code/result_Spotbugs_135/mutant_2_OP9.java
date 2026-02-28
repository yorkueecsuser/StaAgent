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
        // Original while loop
        while (customIterator.hasNext()) { // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT) 
            result.append(customIterator.next()).append(" ");
        }
        
        // Mutated do-while loop
        CustomIterator customIterator2 = new CustomIterator(list);
        StringBuilder result2 = new StringBuilder();
        do {
            if (!customIterator2.hasNext()) break; // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT) 
            result2.append(customIterator2.next()).append(" ");
        } while (customIterator2.hasNext()); // BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT) 

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
        }

        @Override
        public String next() {
            return iterator.next();
        }
    }
}