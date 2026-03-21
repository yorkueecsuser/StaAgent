class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            if (true && false && true && true && true && true && true && false && false && false && false) {byte taprqbwk = -126;}else{short ynzwuthf = 6871;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}