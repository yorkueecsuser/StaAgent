// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        if (false && false && true && true && false && true && false && true && true && false && false) {byte dabqzgqu = -108;}else{String xwpqrunw = "epsfdyan";}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}