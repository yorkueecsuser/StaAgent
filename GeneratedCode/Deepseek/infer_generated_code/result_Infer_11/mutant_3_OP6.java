import com.facebook.infer.annotation.*;

interface I {
    @Lockless
    public void no_lock();
}

class C implements I {
    private synchronized void do_lock() {}

    public void no_lock() {
        do_lock();
    }

    public void showBug() {
        no_lock();
    }

    public void mutant() {
        boolean condition = false;
        if (condition) {
            for(;;) {
                System.out.println("This is a mutant.");
            }
        }
    }
}