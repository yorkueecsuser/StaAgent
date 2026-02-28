class IndexOfRangeBugExample {

    public int showBug(String input, String searchStr, int beginIndex, int endIndex) {
        // This method demonstrates the bug with String.indexOf using incorrect ranges
        // Lines with the bug will throw StringIndexOutOfBoundsException if uncommented
        // Due to beginIndex > endIndex
        int index = input.indexOf(searchStr, endIndex, beginIndex); // BUG: "String.indexOf" should be used with correct ranges
        return index;
    }

    public static void main(String[] args) {
        IndexOfRangeBugExample example = new IndexOfRangeBugExample();
        // This will cause an exception to be thrown due to incorrect range
        try {
            System.out.println(example.showBug("hello world", "world", 5, 11));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }

        // Another example where beginIndex is negative
        try {
            System.out.println(example.showBug("hello world", "world", -1, 5)); // BUG: "String.indexOf" should be used with correct ranges
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}