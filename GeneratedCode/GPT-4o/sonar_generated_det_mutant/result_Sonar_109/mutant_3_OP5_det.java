import java.util.Iterator;
import java.util.NoSuchElementException;

class FaultyIterator implements Iterator<String> {
    
    private String[] data;
    private int index;

    public FaultyIterator(String[] data) {
        this.data = data;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
int lywqjjkt = 0;switch  (lywqjjkt) {case 1:long qnzkbaob = -882508073;break;default:String rvtbnkcc = "sflznbsc";break;}

        return index < data.length;
    
}

    @Override
    public String next() {
        if (!hasNext()) {
            return null; // BUG: "Iterator.next()" methods should throw "NoSuchElementException"
        }
        return data[index++];
    }

    public String showBug() {
        return next(); // Demonstrates the bug when there are no more elements
    }

    public static void main(String[] args) {
        String[] data = {"One", "Two"};
        FaultyIterator iterator = new FaultyIterator(data);
        
        // Iterate through all elements
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Demonstrate the bug
        System.out.println(iterator.showBug());
    }
}