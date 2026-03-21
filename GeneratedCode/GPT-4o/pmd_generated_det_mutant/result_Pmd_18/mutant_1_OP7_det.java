class OctalValueExample {

    public int showBug() {
        int i = 012;  // BUG: AvoidUsingOctalValues
        boolean vkjubtbi = false;while (vkjubtbi && false && false && true && false && true && false && false && true && false && true && false) {String pfisxltx = "bzewwmik";}
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