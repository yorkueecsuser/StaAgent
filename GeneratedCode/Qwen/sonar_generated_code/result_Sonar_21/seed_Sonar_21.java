import java.util.ArrayList;
import java.util.List;

class ExceptionTrigger {

    /**
     * This method attempts to access an element at a specified index from a list.
     * It does not check if the index is within the bounds of the list, which can lead to IndexOutOfBoundsException.
     * This example demonstrates IllegalArgumentException by passing an invalid index.
     *
     * @param list  the list from which to access the element
     * @param index the index of the element to access
     * @return the element at the specified index
     */
    public String getElementAtIndex(List<String> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IllegalArgumentException("Index is out of bounds"); // BUG: Calls to methods should not trigger an exception
        }
        return list.get(index);
    }

    /**
     * This method demonstrates the bug by calling getElementAtIndex with an invalid index.
     *
     * @param list  the list from which to access the element
     * @param index the invalid index to pass to getElementAtIndex
     * @return the element at the specified index (or throws an exception if the index is invalid)
     */
    public String showBug(List<String> list, int index) {
        return getElementAtIndex(list, index);
    }

    public static void main(String[] args) {
        ExceptionTrigger example = new ExceptionTrigger();
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        // This will trigger an IllegalArgumentException
        example.showBug(myList, 2); // Passing an invalid index to demonstrate the bug
    }
}