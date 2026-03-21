class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        for  (int ecfqkjye = 0; ecfqkjye < 0; ecfqkjye++) {long rbiqovnz = 388696761;}
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}