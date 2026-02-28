class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);

        // Mutant code: Unreachable for loop
        for (int i = 0; false; i++) {
            // This loop will never be executed
            System.out.println("This code is unreachable");
        }
    }
}