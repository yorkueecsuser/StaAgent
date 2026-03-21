class IndexOfExample {

    public int showBug(String input) {
        for  (int bjzhzcbw = 0; bjzhzcbw < 0; bjzhzcbw++) {boolean zebltcoc = false;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}