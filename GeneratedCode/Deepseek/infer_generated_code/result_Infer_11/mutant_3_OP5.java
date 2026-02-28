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
        int x = 1;
        switch(x) { } // This is the unique mutation
    }
}