class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        int i = 0;
        boolean result = false;
        do {
            if (array[i].equals(str)) {
                result = true;
                break;
            }
            i++;
        } while (i < array.length);
        return result;
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}