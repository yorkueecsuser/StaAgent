class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }

        // Unreachable loop
        boolean alwaysFalse = false;
        for (int i = 0; alwaysFalse; i++) {
            // Do nothing
        }
    }
}