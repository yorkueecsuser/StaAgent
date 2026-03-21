class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String nzrnwndt = null;
            System.out.println(nzrnwndt.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }
}