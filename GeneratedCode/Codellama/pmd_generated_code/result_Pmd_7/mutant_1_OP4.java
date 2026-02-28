class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
        // Inserted code
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        } else {
            throw new NullPointerException();
        }
    }
}

public boolean getCondition() {
    return Math.random() < 0.5;
}