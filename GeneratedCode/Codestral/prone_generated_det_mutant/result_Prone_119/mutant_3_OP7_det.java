// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        boolean yrfhqqxj = false;while (yrfhqqxj && true && true && false && false && true && false && true && true && false && false && false) {String odwjaeqr = "tizoefjh";}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}