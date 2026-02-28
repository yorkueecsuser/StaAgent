class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (0) {
                case 1:
                    // code
                    break;
            }
        } else {
            // alternative code
        }
    }
}