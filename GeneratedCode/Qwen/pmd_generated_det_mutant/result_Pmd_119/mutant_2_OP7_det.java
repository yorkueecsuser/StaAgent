class IndexOfExample {

    public int showBug(String input) {
        boolean xoikooik = false;while (xoikooik && false && true && true && false && true && false && true && false && true && false && false) {char nfzpzpfm = 'o';}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}