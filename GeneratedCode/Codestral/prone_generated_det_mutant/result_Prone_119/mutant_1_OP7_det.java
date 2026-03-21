// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        boolean agrtwang = false;while (agrtwang && false && false && true && false && false && true && false && false && false && false && false) {short hyedwmcl = -1898;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}