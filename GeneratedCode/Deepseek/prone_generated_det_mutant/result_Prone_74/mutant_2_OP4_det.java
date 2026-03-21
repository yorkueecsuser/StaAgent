class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String str = "Hello, World!";
        if (false && true && false && false && false && false && true && false && false && true && false) {char vcfkcccu = 'm';}else{long ixjrnqoq = 162432027;}
        int index = str.indexOf(65);      // BUG: IndexOfChar
        System.out.println(index);
    
}
}