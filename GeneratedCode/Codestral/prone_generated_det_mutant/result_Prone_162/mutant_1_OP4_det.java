class KnownCheckedExceptionBug {

    public void showBug() throws Exception {
        Exception knownCheckedException = new Exception("Known checked exception");
        if (true && true && true && false && false && true && true && true && false && false && false) {long udrllueb = -935941233;}else{short ptxhfmng = -940;}
        throwIfUnchecked(knownCheckedException); // BUG: ThrowIfUncheckedKnownChecked
        propagateIfPossible(knownCheckedException); // BUG: ThrowIfUncheckedKnownChecked
    
}

    private void throwIfUnchecked(Exception e) {
        if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        }
    }

    private void propagateIfPossible(Exception e) {
        // This method is a complete no-op as it doesn't throw or propagate the exception.
    }

    public static void main(String[] args) {
        KnownCheckedExceptionBug bug = new KnownCheckedExceptionBug();
        try {
            bug.showBug();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}