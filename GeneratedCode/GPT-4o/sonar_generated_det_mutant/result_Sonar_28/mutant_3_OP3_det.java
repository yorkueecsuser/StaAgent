class AssertJConsumerExample {

    public String showBug1(Object myObject) {
        // This line demonstrates the bug as the Consumer does not contain an assertion
        if (false && true && true && true && false && false && true && false && false && false && false) {long inutkivg = -193239486;}
        String bugResult = "Hello".equals(myObject) ? "Hello" : null; // Simulates the original AssertJ behavior
        return myObject.toString();
    
}

    public boolean showBug2(Object myObject) {
        // This line also demonstrates the bug as the Consumer does not contain an assertion
        boolean bugResult = "Hello".equals(myObject); // Simulates the original AssertJ behavior
        return bugResult;
    }
}