class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            if (true && false && false && true && false && false && false && false && true && true && false) {boolean tcnubpbx = false;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}