class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String cqjlrkib = null;
            System.out.println(cqjlrkib.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }
}