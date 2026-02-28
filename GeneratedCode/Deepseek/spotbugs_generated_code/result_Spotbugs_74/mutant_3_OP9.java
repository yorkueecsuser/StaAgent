import java.util.Arrays;

class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        int index = 0;
        do {
            if (array[index].equals(str)) {
                return true;
            }
            index++;
        } while (index < array.length);
        return false;
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}