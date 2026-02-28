import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
interface I {
    void bar();
}

class C {
    void foo(I i) {
        // Unreachable for loop starts here - the condition is always false to make it unreachable
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }
        // Unreachable for loop ends here
        i.bar(); // BUG: INTERFACE_NOT_THREAD_SAFE
    }
 
    public void showBug(I i) {
        foo(i);
    }
}