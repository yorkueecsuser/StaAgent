class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        int x1 = 10;
        String y1 = String.valueOf(x1);
        System.out.println(y1);
    }
}