// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        boolean qzmqdyrg = false;while (qzmqdyrg && true && false && false && true && true && true && false && true && false && true && false) {short xyikutyi = -2311;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}