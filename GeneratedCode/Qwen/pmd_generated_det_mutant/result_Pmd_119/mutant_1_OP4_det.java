class IndexOfExample {

    public int showBug(String input) {
        if (false && false && false && false && false && true && true && true && false && false && false) {float tpgywxxq = 636236583;}else{long tflexrzo = -218502142;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}