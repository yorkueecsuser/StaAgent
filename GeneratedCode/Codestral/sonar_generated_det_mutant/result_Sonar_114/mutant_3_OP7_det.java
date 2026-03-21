class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        boolean ntgqjfat = false;while (ntgqjfat && true && true && false && true && true && false && true && true && false && true && false) {float xkytdkth = 152045363;}
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}