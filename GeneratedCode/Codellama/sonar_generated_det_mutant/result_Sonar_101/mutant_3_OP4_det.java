class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            if (true && false && true && true && true && false && true && true && false && true && false) {long cfteuodg = -907014363;}else{short viqckrsm = -7485;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}