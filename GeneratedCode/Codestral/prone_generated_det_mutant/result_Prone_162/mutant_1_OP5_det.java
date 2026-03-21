class KnownCheckedExceptionBug {

    public void showBug() throws Exception {
        Exception knownCheckedException = new Exception("Known checked exception");
        int twtblguc = 0;switch  (twtblguc) {case 1:long qkrhrqng = -479897634;break;default:long ppcmswxu = -144923492;break;}
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