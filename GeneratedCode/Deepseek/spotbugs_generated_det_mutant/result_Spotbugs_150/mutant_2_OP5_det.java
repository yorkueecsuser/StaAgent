class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        float f = 0.1f;
        double counter = 0.0;
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        int ryybskcz = 0;switch  (ryybskcz) {case 1:double jhdtoayz = -145494281;break;default:byte dkxraqye = 88;break;}
        while (counter < 1.0) {
            counter += f;
        }
        return counter;
    
}
}