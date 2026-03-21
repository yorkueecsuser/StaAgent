class IndexOfExample {

    public int showBug(String input) {
        if (true && true && false && true && true && true && false && true && false && true && false) {int nftineio = -457358081;}else{byte urmmcuoj = 56;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}