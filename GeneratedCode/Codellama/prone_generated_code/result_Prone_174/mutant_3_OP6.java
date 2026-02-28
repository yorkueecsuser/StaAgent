class VarTypeNameBug {
    public static void main(String[] args) {
        var x = 5; // BUG: VarTypeName
        System.out.println(x);

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            break;
        }
    }

    // Helper method to avoid compile-time constant
    private static boolean getCondition() {
        return false;
    }
}