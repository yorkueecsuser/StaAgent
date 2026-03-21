class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        boolean rnfcguts = false;while (rnfcguts && true && true && false && false && true && true && false && true && false && true && false) {long nrbsumwg = -229604349;}
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}