class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    }
    
    // Unreachable if statement mutant
    public static void mainMutant(String[] args) {
        var x = 5; // BUG: VarTypeName
        if (false) {
            System.out.println("This statement is unreachable.");
        }
        System.out.println(x);
    }
}