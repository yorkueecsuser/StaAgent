// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        int jalxseyx = 0;switch  (jalxseyx) {case 1:int bmarwekp = 435485566;break;default:short tisohgvr = 267;break;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}