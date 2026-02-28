class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();

            throw new NullPointerException();
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    }
}