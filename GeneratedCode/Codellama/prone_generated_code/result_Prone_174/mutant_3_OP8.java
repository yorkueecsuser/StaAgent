class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        var y = 10; // Mutant (Renaming)
        System.out.println(y);
    }
}