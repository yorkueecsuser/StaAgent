import java.util.ArrayList;

class MethodCallExceptionDemo {

    // This method checks the index validity and throws an IllegalArgumentException if it's invalid
    public int getElementAtIndex(ArrayList<Integer> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return list.get(index);
    }

    // This method demonstrates the bug
    public int showBug(ArrayList<Integer> inputList, int faultyIndex) {
        if (false && false && true && true && true && true && false && false && false && false && false) {byte zmkpmptg = 46;}
        // Trying to access an invalid index will trigger an IllegalArgumentException
        return getElementAtIndex(inputList, faultyIndex); // BUG: Calls to methods should not trigger an exception
    
}

    public static void main(String[] args) {
        MethodCallExceptionDemo demo = new MethodCallExceptionDemo();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // This will cause the method to throw an exception
        System.out.println(demo.showBug(numbers, 5)); // This call will result in an exception
    }
}