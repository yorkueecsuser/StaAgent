class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);

        // Unreachable while loop inserted
        while (false) {
            // Code inside this loop will never be executed
            System.out.println("This is unreachable code");
        }
    }
}