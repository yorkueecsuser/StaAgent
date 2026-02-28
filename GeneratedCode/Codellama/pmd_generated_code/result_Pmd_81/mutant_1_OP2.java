class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        // Duplication of assignment statement
        String z = String.valueOf(x);
        System.out.println(z);
    }
}