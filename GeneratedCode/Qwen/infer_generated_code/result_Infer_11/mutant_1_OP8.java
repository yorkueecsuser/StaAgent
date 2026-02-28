import com.facebook.infer.annotation.Lockless;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock(); // BUG: LOCKLESS_VIOLATION
    }

    // Mutant code with renaming of method 'do_lock' to 'x'
    private synchronized void x() {}

    public void no_lock_mutant() {
        x(); // Mutated call to renamed method
    }

    public void showBug() {
        no_lock();
    }

    public void showBugMutant() {
        no_lock_mutant();
    }
}