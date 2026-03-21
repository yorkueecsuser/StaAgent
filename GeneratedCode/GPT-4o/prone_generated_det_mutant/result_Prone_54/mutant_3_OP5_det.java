class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        int pdkngiyz = 0;switch  (pdkngiyz) {case 1:String dryhnfue = "iiuoimoj";break;default:byte opbgavyq = 124;break;}
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    
}
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}