class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }
}