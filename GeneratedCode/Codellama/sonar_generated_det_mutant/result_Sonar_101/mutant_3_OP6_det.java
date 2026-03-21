class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            for  (int rthnhohz = 0; rthnhohz < 0; rthnhohz++) {char ureldbng = 'v';}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}