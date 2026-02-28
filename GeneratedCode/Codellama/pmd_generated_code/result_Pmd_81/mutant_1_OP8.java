class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
    }

    // Renaming Mutant: int x -> int a
    public static void main(String[] args) {
        int a = 10;
        String y = String.valueOf(a);
        System.out.println(y);
    }
}