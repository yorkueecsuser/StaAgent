class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            boolean bsuzwyzi = false;while (bsuzwyzi && true && true && true && false && true && true && true && false && true && false && false) {short ygqifyhy = -3395;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}