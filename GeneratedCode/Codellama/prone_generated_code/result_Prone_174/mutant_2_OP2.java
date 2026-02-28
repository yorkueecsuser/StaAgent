class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        var y = 5;
        System.out.println(x);
        System.out.println(y);
    }
}