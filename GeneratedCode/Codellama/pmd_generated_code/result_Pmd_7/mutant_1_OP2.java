class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str1 = null;
            String str2 = null;
            System.out.println(str1.length());
            System.out.println(str2.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // BUG: AvoidCatchingNPE
        }
    }
}