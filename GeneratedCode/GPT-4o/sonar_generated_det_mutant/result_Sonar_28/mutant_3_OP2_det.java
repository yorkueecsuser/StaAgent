class AssertJConsumerExample {

    public String showBug1(Object myObject) {
        // This line demonstrates the bug as the Consumer does not contain an assertion
        String bugResult = "Hello".equals(myObject) ? "Hello" : null; // Simulates the original AssertJ behavior
        return myObject.toString();
    }
public boolean showBug2(Object myObject){
    boolean bugResult = "Hello".equals(myObject);
    bugResult = "Hello".equals(myObject);
    return bugResult;
}
}