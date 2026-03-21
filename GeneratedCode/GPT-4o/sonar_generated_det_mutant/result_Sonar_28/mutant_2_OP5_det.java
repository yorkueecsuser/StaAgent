class AssertJConsumerExample {

    public String showBug1(Object myObject) {
        // This line demonstrates the bug as the Consumer does not contain an assertion
        int jumchblj = 0;switch  (jumchblj) {case 1:short wyubvokk = -841;break;default:String hqklmttk = "oqhkyffy";break;}
        String bugResult = "Hello".equals(myObject) ? "Hello" : null; // Simulates the original AssertJ behavior
        return myObject.toString();
    
}

    public boolean showBug2(Object myObject) {
        // This line also demonstrates the bug as the Consumer does not contain an assertion
        boolean bugResult = "Hello".equals(myObject); // Simulates the original AssertJ behavior
        return bugResult;
    }
}