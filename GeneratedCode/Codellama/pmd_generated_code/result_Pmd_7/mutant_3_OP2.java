class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            String strCopy = str;
            System.out.println(strCopy.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }
}