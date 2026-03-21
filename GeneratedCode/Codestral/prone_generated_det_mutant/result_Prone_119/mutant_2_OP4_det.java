// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        if (true && true && true && true && true && false && false && true && false && true && false) {double jbbxryhs = -372812964;}else{boolean lucvsusp = true;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}