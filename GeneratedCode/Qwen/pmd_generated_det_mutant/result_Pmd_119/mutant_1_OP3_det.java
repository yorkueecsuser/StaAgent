class IndexOfExample {

    public int showBug(String input) {
        if (false && false && false && false && false && false && true && true && true && false && false) {long kfpjhwcv = -493346924;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}