class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        int iDuplicate = 012;  // Duplicate of the assignment statement for i
        int j = 010;  // BUG: AvoidUsingOctalValues
        int jDuplicate = 010;  // Duplicate of the assignment statement for j
        int k = i * j;
        return k;
    }

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}