class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            double bnhhevse = -25864163;
            throw new NullPointerException(); // BUG: TryFailThrowable
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    
}
}