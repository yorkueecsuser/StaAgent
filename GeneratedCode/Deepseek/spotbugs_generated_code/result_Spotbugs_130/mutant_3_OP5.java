class IntegerRemainderBug {
    // Original buggy line
    public int showBug(int i) {
        return i % 60 * 1000;
    }

    // Added mutant code
    public void unreachableSwitchStatement(int i) {
        switch (i % 60 * 1000) { // This will never be reached as the value will never be a case
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}