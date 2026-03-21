class AssertJConsumerExample {
public String showBug1(Object myObject){
    String bugResult = "Hello".equals(myObject)? "Hello" : null;
    bugResult = "Hello".equals(myObject)? "Hello" : null;
    return myObject.toString();
}

    public boolean showBug2(Object myObject) {
        // This line also demonstrates the bug as the Consumer does not contain an assertion
        boolean bugResult = "Hello".equals(myObject); // Simulates the original AssertJ behavior
        return bugResult;
    }
}