class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        var x = 5; // DUPLICATION - Additional variable with same name and value
        System.out.println(x);
    }
}