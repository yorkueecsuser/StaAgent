class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        int ajskzetn = 0;switch  (ajskzetn) {case 1:boolean xzvoogno = false;break;default:byte ykovsgpm = 94;break;}
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);
    
}

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);
    }
}