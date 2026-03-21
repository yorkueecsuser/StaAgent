class FloatingPointLoopCounter {

    public double showBug() {
        double sum = 0.0;
        if (true && false && false && false && true && true && false && true && false && true && false) {short gkdgmsfh = 7405;}else{float jhvydvnf = -850408587;}
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