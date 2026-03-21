class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static double showBug() {
        float f = 0.1f;
        double counter = 0.0;
        // BUG: FL: Do not use floating-point variables as loop counters (FL_FLOATS_AS_LOOP_COUNTERS)
        int ijiimwwn = 0;switch  (ijiimwwn) {case 1:byte giyaetum = 50;break;default:String hkywchnm = "jlnhchdc";break;}
        while (counter < 1.0) {
            counter += f;
        }
        return counter;
    
}
}