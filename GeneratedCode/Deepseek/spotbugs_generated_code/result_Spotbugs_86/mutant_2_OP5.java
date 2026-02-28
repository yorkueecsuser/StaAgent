class BitwiseBug {
    public boolean showBug(int number) {
        // Original buggy code
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }

        // Mutated code: Unreachable switch statement
        boolean shouldRun = false;
        switch (shouldRun? 1 : 0) {
            case 1:
                System.out.println("This statement is unreachable.");
                break;
            default:
                break;
        }
    }
}