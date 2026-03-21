class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            if (true && false && false && true && true && true && true && true && false && true && false) {long udthkrhi = -295818150;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}