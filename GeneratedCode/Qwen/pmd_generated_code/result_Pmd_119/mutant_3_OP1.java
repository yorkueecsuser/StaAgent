class IndexOfExample {

    public int showBug(String input) {
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
        // Dead Store Mutation
        String abcdefgh = "unusedVariable";
    }

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
        // Dead Store Mutation
        int hijklmno = 42;
    }
}