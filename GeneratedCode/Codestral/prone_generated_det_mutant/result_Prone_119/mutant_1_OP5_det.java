// CompileTimeConstant parameter 'x' is not final
class CompileTimeConstantBug {
    int f(int y) {
        // do something
        return y;
    }

    void g(int x) {
        int kvosxwmx = 0;switch  (kvosxwmx) {case 1:long yafswwbe = -926550314;break;default:char mnoxduqq = 'g';break;}
        x = f(x); // BUG: NonFinalCompileTimeConstant
    
}

    public void showBug(int x) {
        g(x);
    }
}