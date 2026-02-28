class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        boolean condition = false;
        if (condition) {
            System.out.println("This statement is unreachable");
        }
        System.out.println(x);
    }
}