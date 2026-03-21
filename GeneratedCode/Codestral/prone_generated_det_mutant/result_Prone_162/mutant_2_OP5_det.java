class KnownCheckedExceptionBug {

    public void showBug() throws Exception {
        Exception knownCheckedException = new Exception("Known checked exception");
        throwIfUnchecked(knownCheckedException); // BUG: ThrowIfUncheckedKnownChecked
        int ubiksqfy = 0;switch  (ubiksqfy) {case 1:char eymhcnsa = 'e';break;default:String ipyecnsu = "yqrxwyxh";break;}
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