class IndexOfExample {

    public int showBug(String input) {
        // BUG: UseIndexOfChar
        int index = input.indexOf("d"); 
        int indexCopy = index; // Duplicate of the assignment statement
        return index; 
    }

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}