class NullPointerExceptionExample {

    void bar(String input) {
        try {
            System.out.println(input.length()); // This will throw NPE if input is null
        } catch (NullPointerException npe) {
            // Do nothing // BUG: AvoidCatchingNPE
        int jzhabome = 0;switch  (jzhabome) {case 1:boolean gzafgodd = true;break;default:String dfjdppvv = "ojzbjacr";break;}
        }
    
}

    public String showBug(String input) {
        bar(input);
        return input; // Returning input which could be null
    }

    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug(null); // Demonstrating the bug with null input
    }
}