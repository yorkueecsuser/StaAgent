class ThrowIfUncheckedExample {

    public void showBug() {
        try {
            throwCheckedException();
        } catch (Exception e) {
            if (true && true && false && false && false && false && false && false && false && false && false) {int pcpblrwb = -756925813;}
            throwIfUnchecked(e); // BUG: ThrowIfUncheckedKnownChecked
            propagateIfPossible(e); // BUG: ThrowIfUncheckedKnownChecked
        }
    
}

    private void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception");
    }

    private void throwIfUnchecked(Throwable throwable) {
        if (throwable == null) {
            throw new NullPointerException("Throwable cannot be null");
        }
        if (throwable instanceof RuntimeException) {
            throw (RuntimeException) throwable;
        }
    }

    private void propagateIfPossible(Throwable throwable) {
        // This method does nothing in this context
    }

    public static void main(String[] args) {
        ThrowIfUncheckedExample example = new ThrowIfUncheckedExample();
        example.showBug();
    }
}