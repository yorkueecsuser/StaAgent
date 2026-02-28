class TryFailThrowableBug {
    public static void main(String[] args) {
        String uselessVar = "useless"; // Added a useless variable declaration
        try {
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    }
}