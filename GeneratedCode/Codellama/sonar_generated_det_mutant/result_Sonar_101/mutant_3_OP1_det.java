class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            byte bmtpctyw = -3;
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}