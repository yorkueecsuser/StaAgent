import java.util.List;
import java.util.ArrayList;

class MockitoBugExample {
    public List<String> showBug(List<String> inputList) {
        List<String> mockedList = new ArrayList<>();
        if (!inputList.isEmpty()) {
            mockedList.add(inputList.get(0)); // BUG: Mockito argument matchers should be used on all parameters
        }
        return mockedList;
    }
}