class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
    }

    private void throwNullException() throws Exception {
        int abcdefgh = 42; // Unused variable declaration added as a dead store
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
}