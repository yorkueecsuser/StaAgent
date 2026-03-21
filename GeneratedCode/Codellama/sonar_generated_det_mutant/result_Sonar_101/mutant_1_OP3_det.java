class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            if (true && false && false && true && false && false && false && true && false && false && false) {String vullwvfw = "dgngsnvw";}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}