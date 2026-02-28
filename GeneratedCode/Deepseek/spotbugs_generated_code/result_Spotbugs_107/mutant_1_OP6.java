class UnneededCurrentThreadCall {
    public boolean showBug() {
        boolean condition = false; // False condition to make the loop unreachable
        for (int i = 0; condition; i++) { // Unreachable loop inserted as per the mutation operator
            System.out.println("This line will never be executed");
        }
        return Thread.currentThread().isInterrupted(); // Original bug still present
    }
}