class AvoidCatchingNPE {
    public static void main(String[] args) {
        try {
            String z = null;
            System.out.println(z.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // Mutant: Renaming `str` to `z`
        }
    }
}