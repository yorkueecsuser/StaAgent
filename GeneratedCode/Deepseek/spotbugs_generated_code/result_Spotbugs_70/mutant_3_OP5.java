class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This line should never be executed.");
                break;
            default:
                break;
        }
        return a == b;
    }

    private int getUnreachableValue() {
        return -1;
    }
}