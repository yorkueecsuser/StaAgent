class SpringBugExample {
    // BUG: Methods with Spring proxying annotations should be public
    private void transactionalMethod() {
        // Transactional logic here
    }

    public void showBug() {
        try {
            transactionalMethod();
        } catch (Exception e) {
            System.out.println("Bug occurred: " + e.getMessage());
        }
    }
}