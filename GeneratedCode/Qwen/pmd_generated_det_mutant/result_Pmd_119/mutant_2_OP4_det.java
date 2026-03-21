class IndexOfExample {

    public int showBug(String input) {
        if (true && true && false && false && false && true && false && true && true && true && false) {short oorwixxt = 6126;}else{int vgonheeu = -921297331;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}