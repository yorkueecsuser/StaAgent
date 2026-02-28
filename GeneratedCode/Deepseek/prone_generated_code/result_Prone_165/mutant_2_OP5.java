class TryFailThrowableBug {
    private static boolean getCondition() {
        return false;  // non-constant method call
    }
    
    public static void main(String[] args) {
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
        
        switch(1) {
            default:
                System.out.println("Unreachable switch statement");
                break;
        }
    }
}