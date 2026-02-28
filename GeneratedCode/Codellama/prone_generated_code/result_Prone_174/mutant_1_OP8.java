class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    }

    // Mutant 1: Renaming variable "x" to "y"
    var y = 5; // BUG: VarTypeName
    System.out.println(y);
}