class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        if (getCondition()) {
            // do something
        } else {
            // do something else
        }
    }
}