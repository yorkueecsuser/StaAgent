class VirtualThreadBug {
    Object lock = new Object();

    void synchronizedMethod() {
        // This method is synchronized, which will cause the virtual thread to stay pinned to the underlying OS thread during its execution.
    }

    void showBug() {
        Thread.startVirtualThread(() -> {
            synchronized (lock) { // Noncompliant; use a platform thread instead of a virtual one // BUG: Virtual threads should not run tasks that include synchronized code
                if (someCondition()) {
                    synchronizedMethod();
                } else {
                    defaultLogic();
                }
            }
        });
    }

    boolean someCondition() {
        // Some condition
        return true;
    }

    void defaultLogic() {
        // Default logic
    }
}