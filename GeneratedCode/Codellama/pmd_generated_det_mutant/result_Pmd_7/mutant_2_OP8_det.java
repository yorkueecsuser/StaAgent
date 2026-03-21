class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String ommysmvo = null;
            System.out.println(ommysmvo.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }
}