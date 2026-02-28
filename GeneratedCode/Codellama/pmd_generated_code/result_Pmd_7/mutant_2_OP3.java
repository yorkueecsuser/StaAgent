class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            if (false) {
                System.out.println("Caught NPE");
            } else {
                System.out.println("Not caught NPE");
            }
        }
    }
}