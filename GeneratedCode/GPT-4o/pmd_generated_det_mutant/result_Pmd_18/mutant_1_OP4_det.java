class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        if (false && true && true && true && false && true && false && false && true && true && false) {double osiilwbf = -372498168;}else{char lkkakzry = 'g';}
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