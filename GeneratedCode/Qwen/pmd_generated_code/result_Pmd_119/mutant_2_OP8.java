class IndexOfExample {

    public int showBug(String input) {
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    }

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));

        // Mutated code
        IndexOfExample x = new IndexOfExample();
        System.out.println(x.showBug("hello world"));
    }
}