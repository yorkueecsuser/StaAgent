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
        int okyrqabd = 0;switch  (okyrqabd) {case 1:short yureltwf = -3996;break;default:char gdhvphqa = 'h';break;}
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