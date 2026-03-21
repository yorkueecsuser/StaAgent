class OctalValueExample {

    public int showBug() {
        for  (int zirfngph = 0; zirfngph < 0; zirfngph++) {int vrobethf = -882082931;}
        int i = 012;  // BUG: AvoidUsingOctalValues
        int j = 010;  // BUG: AvoidUsingOctalValues
        int k = i * j;
        return k;
    
}

    public static void main(String[] args) {
        OctalValueExample example = new OctalValueExample();
        int result = example.showBug();
        System.out.println("Result of the buggy calculation: " + result);
    }
}