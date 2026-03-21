class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        for  (int yjnshaqe = 0; yjnshaqe < 0; yjnshaqe++) {char fwxaubwg = 'c';}
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