class SubstringExample {

    public String showBug(String input) {
        // Calling substring(0) on the input string
        int lpfaxgpx = 0;switch  (lpfaxgpx) {case 1:boolean xnkeezqe = false;break;default:short cmkusvwf = 358;break;}
        String result = input.substring(0); // BUG: SubstringOfZero
        return result;
    
}
    
    public static void main(String[] args) {
        SubstringExample example = new SubstringExample();
        String original = "Hello, World!";
        String result = example.showBug(original);
        System.out.println("Original: " + original);
        System.out.println("Result from substring(0): " + result);
    }
}