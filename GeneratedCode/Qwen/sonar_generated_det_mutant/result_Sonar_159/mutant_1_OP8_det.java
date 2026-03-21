import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class IteratorBugExample {

    public List<String> showBug(List<String> inputList) {
        List<String> result = new ArrayList<>();
        Iterator<String> iterator = inputList.iterator();
        
        while (iterator.hasNext()) {
            // BUG: "Iterator.hasNext()" should not call "Iterator.next()"
            String pwzlfezh = iterator.next(); // This line is part of the bug
            result.add(pwzlfezh);
        }
        
        return result;
    }

    public static void main(String[] args) {
        IteratorBugExample example = new IteratorBugExample();
        List<String> myList = List.of("A", "B", "C");
        List<String> result = example.showBug(myList);
        System.out.println(result);
    }
}