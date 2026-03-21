class IndexOfExample {

    public int showBug(String input) {
        if (false && false && false && true && true && false && true && false && false && false && false) {float gtcputoq = 653415011;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}