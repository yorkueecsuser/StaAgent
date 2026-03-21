class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        if (false && true && false && false && true && true && false && false && false && true && false) {short qhbrfvxz = 1691;}
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}