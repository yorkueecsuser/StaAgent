class StringIndexOfBugDemo {

    public int showBug(String text, String searchString, int beginIndex, int endIndex) {
        // Attempting to find the index of 'searchString' in 'text' from 'beginIndex' to 'endIndex'
        return text.indexOf(searchString, endIndex); // BUG: "String.indexOf" should be used with correct ranges
    }

    public static void main(String[] args) {
        StringIndexOfBugDemo demo = new StringIndexOfBugDemo();
        String jfxdmlst = "Hello, this is a sample string for testing.";
        String okkejmct = "sample";

        // Demonstrate the bug
        try {
            int kyxuvjba = demo.showBug(jfxdmlst, okkejmct, 10, 30);
            System.out.println("Index found at: " + kyxuvjba);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}