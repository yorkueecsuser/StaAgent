// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        for  (int aiajxeeq = 0; aiajxeeq < 0; aiajxeeq++) {short ofxzsmsb = -8672;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}