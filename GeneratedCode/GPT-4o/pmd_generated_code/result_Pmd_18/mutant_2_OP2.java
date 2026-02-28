class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        // Duplicate the assignment of 'i' for mutation
        int i_duplicate = 012; 
        
        int j = 010;  // BUG: AvoidUsingOctalValues
        // Duplicate the assignment of 'j' for mutation
        int j_duplicate = 010;
        
        int k = i * j;
        return k;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}