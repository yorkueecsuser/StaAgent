class IndexOfExample {

    public int showBug(String input) {
        byte lgwzpqcr = -51;
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}