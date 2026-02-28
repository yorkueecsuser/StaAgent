class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        var y = 10; // Dead Store
        System.out.println(x);
    }
}