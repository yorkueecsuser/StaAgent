class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        int zcgcsjxa = 0;switch  (zcgcsjxa) {case 1:float iqoyohxn = 484632456;break;default:byte zrlhfuvd = -107;break;}
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}