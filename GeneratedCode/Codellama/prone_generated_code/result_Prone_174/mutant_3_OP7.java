class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        while (false) {
            System.out.println("This code is unreachable");
        }
    }
}