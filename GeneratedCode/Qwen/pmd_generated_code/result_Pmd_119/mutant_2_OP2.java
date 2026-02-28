class IndexOfExample {

    public int showBug(String input) {
        // BUG: UseIndexOfChar
        int temp = 0; // Introduced a dummy assignment statement
        int temp = 0; // Duplicated the dummy assignment statement
        return input.indexOf("d"); 
    }

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}