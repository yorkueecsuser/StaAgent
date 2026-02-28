class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Unreachable code");
        } else {
            System.out.println(x);
        }
    }
}