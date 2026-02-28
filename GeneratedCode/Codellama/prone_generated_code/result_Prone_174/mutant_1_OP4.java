class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        // Mutant code
        if (false) {
            // unreachable code
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}