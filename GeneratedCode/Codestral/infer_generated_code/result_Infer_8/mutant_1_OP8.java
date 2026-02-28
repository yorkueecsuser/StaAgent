import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;
    @GuardedBy("this")
    String g;  // New variable 'g' as a mutation

    void foo(String s) {
        f = s; // unprotected access here
        g = s; // New mutation: unprotected access to 'g'
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
        System.out.println(g); // New mutation: print the value of 'g'
    }
}