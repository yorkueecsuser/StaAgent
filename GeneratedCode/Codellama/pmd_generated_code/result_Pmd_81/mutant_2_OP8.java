class UnnecessaryConversionTemporary {
    public static void main(String[] args) {
        int x = 10;
        String y = String.valueOf(x);
        System.out.println(y);
        // Mutation Operator: Renaming
        // Original variable name: x
        // New variable name: a
        int a = 10;
        String b = String.valueOf(a);
        System.out.println(b);
    }
}