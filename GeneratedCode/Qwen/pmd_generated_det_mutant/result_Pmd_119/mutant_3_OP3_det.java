class IndexOfExample {

    public int showBug(String input) {
        if (true && false && true && false && false && false && false && false && true && false && false) {int tvbcfxmo = -967916133;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}