import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    // Renaming mutation
    String x;

    void foo(String s) {
        f = s; // unprotected access here
        // Introduce a renaming mutation
        x = s;
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
        // Print the renamed variable to check the mutation
        System.out.println(x);
    }
}