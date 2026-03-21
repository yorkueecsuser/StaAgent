class IndexOfExample {

    public int showBug(String input) {
        boolean ynrctnbf = false;while (ynrctnbf && true && true && false && false && false && true && false && true && false && true && false) {double lrenrggk = 513936483;}
        // BUG: UseIndexOfChar
        return input.indexOf("d"); 
    
}

    public static void main(String[] args) {
        IndexOfExample example = new IndexOfExample();
        System.out.println(example.showBug("hello world"));
    }
}