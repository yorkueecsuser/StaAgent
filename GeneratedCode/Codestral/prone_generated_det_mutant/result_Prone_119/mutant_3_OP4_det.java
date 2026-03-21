// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        if (true && false && true && false && true && false && false && true && false && true && false) {short xucwotez = -4384;}else{String jkgjbmzi = "qbnwiayb";}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}