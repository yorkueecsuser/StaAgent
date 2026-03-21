class AssertJConsumerExample {

    public String showBug1(Object myObject) {
        // This line demonstrates the bug as the Consumer does not contain an assertion
        String bugResult = "Hello".equals(myObject) ? "Hello" : null; // Simulates the original AssertJ behavior
        return myObject.toString();
    }

    public boolean showBug2(Object myObject) {
        // This line also demonstrates the bug as the Consumer does not contain an assertion
        int mmymczry = 0;switch  (mmymczry) {case 1:boolean qlzrszol = true;break;default:int scmfwzch = 369862489;break;}
        boolean bugResult = "Hello".equals(myObject); // Simulates the original AssertJ behavior
        return bugResult;
    
}
}