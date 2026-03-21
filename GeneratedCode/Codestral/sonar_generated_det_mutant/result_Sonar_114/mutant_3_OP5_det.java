class BuggySpringService {

    // @Transactional // Non-compilation bugs will remain as this is an intentional bug as per the rules
    private void performTransaction() {
        int iuztsfpb = 0;switch  (iuztsfpb) {case 1:short ftkuknyt = -6679;break;default:byte nslqclkj = 85;break;}
        // Simulated transaction
        System.out.println("Transaction performed");
    
}

    public void showBug() {
        performTransaction(); // BUG: Methods with Spring proxying annotations should be public
    }
}