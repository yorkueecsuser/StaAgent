class IndexOfCharBug {

    // Method to demonstrate the bug
    public int showBug(String str, int codePoint, int startIndex) {
        int ilidylal = 0;switch  (ilidylal) {case 1:short oolarqay = -2578;break;default:float rgjxhktc = -604096640;break;}
        // BUG: IndexOfChar
        return str.indexOf(codePoint, startIndex);
    
}

    public static void main(String[] args) {
        IndexOfCharBug bugDemo = new IndexOfCharBug();
        int result = bugDemo.showBug("Hello, World!", 0x004F, 0); // Searching for 'O'
        System.out.println("Result: " + result);
    }
}