// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        int nfcusgxm = 0;switch  (nfcusgxm) {case 1:double virgxntu = -898051575;break;default:String wyxiyakb = "gyyflgwq";break;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}