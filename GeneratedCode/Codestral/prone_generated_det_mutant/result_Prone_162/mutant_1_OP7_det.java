class KnownCheckedExceptionBug {

    public void showBug() throws Exception {
        Exception knownCheckedException = new Exception("Known checked exception");
        boolean zjgyacnw = false;while (zjgyacnw && false && true && false && false && false && false && true && true && false && true && false) {double qtkxxere = 408117390;}
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