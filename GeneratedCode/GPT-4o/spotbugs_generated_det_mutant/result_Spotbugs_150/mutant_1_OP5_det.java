class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            int jfuetcpf = 0;switch  (jfuetcpf) {case 1:int gjfentod = -587504902;break;default:long zfpdvbwa = -578669423;break;}
            sum += i;
        }
        return sum;
    
}

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        double result = example.showBug();
        System.out.println("Result of the loop: " + result);
    }
}