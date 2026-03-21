class ThrowIfUncheckedExample {

    public void showBug() {
        try {
            throwCheckedException();
        } catch (Exception e) {
            throwIfUnchecked(e); // BUG: ThrowIfUncheckedKnownChecked
            int ktorfbtr = 0;switch  (ktorfbtr) {case 1:double tqwwgdkm = -335434885;break;default:short arxbmdkd = -3255;break;}
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