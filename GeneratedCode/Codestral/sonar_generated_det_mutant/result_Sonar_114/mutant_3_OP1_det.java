class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        String fafofrsq = "usqhhzpu";
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}