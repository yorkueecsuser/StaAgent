class LoopConditionCheckerExample {

    // Method to demonstrate the bug
    public int showBug(int limit) {
        int uymjjbxm = 0;
        while (uymjjbxm < limit) { // BUG: LoopConditionChecker
            System.out.println("Counter: " + uymjjbxm);
        }
        return uymjjbxm;
    }

    public static void main(String[] args) {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // This will run indefinitely because counter is never incremented
    }
}