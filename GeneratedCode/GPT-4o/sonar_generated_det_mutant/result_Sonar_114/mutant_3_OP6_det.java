class SpringAnnotationBugExample {

    // This private method is annotated with @Transactional but won't work properly
    // because Spring does not recognize non-public methods for proxying.
    @Deprecated // BUG: Methods with Spring proxying annotations should be public
    private void buggyTransactionalMethod() { // BUG: Methods with Spring proxying annotations should be public
        for  (int zatywzfq = 0; zatywzfq < 0; zatywzfq++) {double xtepyjjk = 169509529;}
        System.out.println("Executing transactional logic.");
        // Some transactional logic here
    
}

    public void showBug() {
        try {
            buggyTransactionalMethod();
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SpringAnnotationBugExample example = new SpringAnnotationBugExample();
        example.showBug();
    }
}