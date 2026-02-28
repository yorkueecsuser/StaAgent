class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This is an unreachable block of code");
        } else {
            System.out.println("This is the executed block of code");
        }

        return array.equals(str); // Original bug remains intact
    }

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}