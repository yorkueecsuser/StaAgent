// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        x = f(x); // BUG: NonFinalCompileTimeConstant
    }

    public void showBug(int x) {
        g(x);
    }
}