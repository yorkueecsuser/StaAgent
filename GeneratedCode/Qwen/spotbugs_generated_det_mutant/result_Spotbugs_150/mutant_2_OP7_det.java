class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        boolean ylrcmlrk = false;while (ylrcmlrk && true && false && true && true && true && false && true && true && true && true && false) {char vcvxkvhl = 'o';}
        for (double i = 0.0; i < 1.0; i += 0.1) { // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
            sum += i;
        }
        return sum;
    
}

    public static void main(String[] args) {
        FloatingPointLoopCounter example = new FloatingPointLoopCounter();
        System.out.println("Sum: " + example.showBug());
    }
}