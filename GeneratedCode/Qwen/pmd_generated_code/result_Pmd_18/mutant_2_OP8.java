class OctalBugExample {

    public int showBug() {
        int i = 012; // BUG: AvoidUsingOctalValues
        int j = 010; // BUG: AvoidUsingOctalValues
        int k = i * j;
        
        // Mutant code with renaming variable 'i' to 'a'
        int a = 012; // BUG: AvoidUsingOctalValues
        int b = 010; // BUG: AvoidUsingOctalValues
        int c = a * b;
        
        return k;
    }

    public static void main(String[] args) {
        OctalBugExample example = new OctalBugExample();
        System.out.println("Result of buggy multiplication: " + example.showBug());
    }
}