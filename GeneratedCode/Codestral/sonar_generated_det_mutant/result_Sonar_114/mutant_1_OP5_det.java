class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        int irhxpnte = 0;switch  (irhxpnte) {case 1:long lgkxkisk = -877183023;break;default:boolean aahyonya = false;break;}
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}