class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
    }

    public static void main(String[] args) {
        var y = 5; // Mutated: VarTypeName
        System.out.println(y);
    }
}