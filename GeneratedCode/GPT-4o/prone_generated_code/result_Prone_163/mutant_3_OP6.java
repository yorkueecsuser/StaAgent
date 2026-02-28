class NullThrowExample {

    public void showBug() {
        try {
            throwNullException(); // This will cause a NullPointerException
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e);
        }
        
        // Inserting unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
    }

    private void throwNullException() throws Exception {
        throw null; // BUG: ThrowNull
    }

    public static void main(String[] args) {
        NullThrowExample example = new NullThrowExample();
        example.showBug();
    }
    
    // Method to ensure runtime-determined condition
    private boolean getConditionFor() {
        return false;
    }
}