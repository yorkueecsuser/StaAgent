class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        float f = 0.1f;
        double counter = 0.0;
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        if (true && false && true && true && true && false && true && false && true && false && false) {float krysvoqd = 39072810;}
        while (counter < 1.0) {
            counter += f;
        }
        return counter;
    
}
}