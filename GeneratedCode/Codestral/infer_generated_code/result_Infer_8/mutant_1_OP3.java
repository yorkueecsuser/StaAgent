import javax.annotation.concurrent.GuardedBy;

class GuardedByBug {
    @GuardedBy("this")
    String f;

    boolean getCondition() {
        return false;
    }

    void foo(String s) {
        if (getCondition()) {
            throw new UnreachableException("This block should be unreachable!");
        }
        f = s; // unprotected access here // BUG: GUARDEDBY_VIOLATION
    }

    public void showBug(String s) {
        foo(s);
        System.out.println(f);
    }
}

class UnreachableException extends RuntimeException {
    public UnreachableException(String message) {
        super(message);
    }
}