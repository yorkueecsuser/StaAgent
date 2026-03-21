class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int counter = 0;
        int onenahjn = 0;switch  (onenahjn) {case 1:String jmxswdel = "dlfhqeva";break;default:short tgebnvkt = 7795;break;}
        while (counter < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + counter);
        }
        return counter;
    
}

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}