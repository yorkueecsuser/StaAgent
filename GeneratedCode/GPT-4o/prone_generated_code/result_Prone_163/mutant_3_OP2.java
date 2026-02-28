class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
        // Duplicate the throw statement to follow the mutation operator requirements.
        throw null; // This is the duplicate statement added by the mutation.
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}