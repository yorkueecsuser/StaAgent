class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        int z = 10;
        String a = String.valueOf(z);
        System.out.println(a);
    }
}