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
        // Duplication mutation operator does not apply to 'throw' statement, hence no duplication here
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
        
        // Example of duplication mutation on an assignment statement
        int a = 10; // Original assignment statement
        int b = 20; // Original assignment statement
        b = 20; // Duplicated assignment statement
        System.out.println("Duplicated assignment result: " + b);
    }
}