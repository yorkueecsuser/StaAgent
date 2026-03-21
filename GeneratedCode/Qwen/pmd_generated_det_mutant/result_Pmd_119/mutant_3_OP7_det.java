class IndexOfExample {

    public int showBug(String input) {
        boolean vcmwnypx = false;while (vcmwnypx && true && false && true && false && false && true && true && true && false && false && false) {float bcsfojml = -269416733;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}