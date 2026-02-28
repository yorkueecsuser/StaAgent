class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        String randomString = "abcd"; // Dead Store
        System.out.println(x);
    }
}