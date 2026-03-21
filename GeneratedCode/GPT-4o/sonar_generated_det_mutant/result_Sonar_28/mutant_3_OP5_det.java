class AssertJConsumerExample {

    public String showBug1(Object myObject) {
        // This line demonstrates the bug as the Consumer does not contain an assertion
        int lbknnvso = 0;switch  (lbknnvso) {case 1:double rtbahilu = -85975112;break;default:double cqsswcgz = 519045634;break;}
        String bugResult = "Hello".equals(myObject) ? "Hello" : null; // Simulates the original AssertJ behavior
        return myObject.toString();
    
}

    public boolean showBug2(Object myObject) {
        // This line also demonstrates the bug as the Consumer does not contain an assertion
        boolean bugResult = "Hello".equals(myObject); // Simulates the original AssertJ behavior
        return bugResult;
    }
}