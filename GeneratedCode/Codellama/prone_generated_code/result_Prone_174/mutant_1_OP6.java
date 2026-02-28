class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);

        // Unreachable for loop
        for (int i = 0; false; i++) {
            // This loop is unreachable because the condition is always false.
        }
    }
}