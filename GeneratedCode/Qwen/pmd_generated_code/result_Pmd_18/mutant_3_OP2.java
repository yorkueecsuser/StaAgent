class OctalBugExample {

    public int showBug() {
        int i = 012; // BUG: AvoidUsingOctalValues
        int i_duplicate = 012; // Duplicate of the assignment to i
        int j = 010; // BUG: AvoidUsingOctalValues
        int j_duplicate = 010; // Duplicate of the assignment to j
        int k = i * j;
        int k_duplicate = i * j; // Duplicate of the assignment to k
        return k;
    }

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}