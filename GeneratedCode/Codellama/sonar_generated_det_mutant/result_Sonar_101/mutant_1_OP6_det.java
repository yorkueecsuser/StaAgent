class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            for  (int ktbhcnki = 0; ktbhcnki < 0; ktbhcnki++) {boolean rzzojozq = false;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}