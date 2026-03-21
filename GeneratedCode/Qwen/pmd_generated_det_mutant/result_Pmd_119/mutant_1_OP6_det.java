class IndexOfExample {

    public int showBug(String input) {
        for  (int tfnhcowq = 0; tfnhcowq < 0; tfnhcowq++) {short fidinigj = 3221;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}