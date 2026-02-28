class TryFailThrowableBug {
    public static void main(String[] args) {
        try {
            throw new Exception(); // Mutation: Renaming the Exception class to Exception
        } catch (Throwable t) {
            System.out.println("Exception caught: " + t);
        }
    }
}