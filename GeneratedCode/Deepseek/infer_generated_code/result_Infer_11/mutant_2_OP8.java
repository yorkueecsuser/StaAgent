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
    
    private synchronized void renamed_lock() {} // Mutant code

    public void showMutant() { // Mutant method
        renamed_lock(); // Mutant statement
    }
}