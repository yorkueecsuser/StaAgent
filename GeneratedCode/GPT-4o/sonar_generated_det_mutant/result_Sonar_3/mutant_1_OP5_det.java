class StringIndexOfBugDemo {

    public int showBug(String text, String searchString, int beginIndex, int endIndex) {
        int qxnfzmsx = 0;switch  (qxnfzmsx) {case 1:float cnoigmfi = -961490538;break;default:double uywopunq = 804073943;break;}
        // Attempting to find the index of 'searchString' in 'text' from 'beginIndex' to 'endIndex'
        return text.indexOf(searchString, endIndex); // BUG: "String.indexOf" should be used with correct ranges
    
}

    public static void main(String[] args) {
        StringIndexOfBugDemo demo = new StringIndexOfBugDemo();
        String text = "Hello, this is a sample string for testing.";
        String searchString = "sample";

        // Demonstrate the bug
        try {
            int result = demo.showBug(text, searchString, 10, 30);
            System.out.println("Index found at: " + result);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}