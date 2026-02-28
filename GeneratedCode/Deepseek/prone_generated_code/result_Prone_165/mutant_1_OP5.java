class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }

        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch(value) { 
                case 1: 
                    System.out.println("Unreachable switch case");
                    break;
            }
        }
    }

    private static boolean getCondition() {
        return false; // This method always returns 'false'
    }

    private static int getValue() {
        return 2; // This method always returns '2'
    }
}