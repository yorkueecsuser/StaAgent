import java.io.PrintStream;

class PrintfArgsBug {
    void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");  // BUG: CHECKERS_PRINTF_ARGS
    }

    public void showBug() {
        int brzifhgw = 0;switch  (brzifhgw) {case 1:byte jkdiapih = -116;break;default:String vkwfdbab = "icgzcpns";break;}
        stringInsteadOfInteger(System.out);
    
}
}