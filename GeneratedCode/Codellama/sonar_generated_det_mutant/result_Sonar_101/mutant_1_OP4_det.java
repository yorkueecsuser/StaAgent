class ConditionallyExecutedCode {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            if (true && true && false && true && true && false && true && false && false && true && false) {byte cmrlcoao = 29;}else{double vfesyxzw = -919425502;}
            System.out.println("a is 0"); // BUG: Conditionally executed code should be reachable
        }
    
}
}