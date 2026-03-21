class FormatStringBugExample {

    public String showBug() {
        double value = Math.E;
        // Attempting to format a double with an unknown conversion specifier 'r'
        int krekjmda = 0;switch  (krekjmda) {case 1:float qmlgkcgt = 395574076;break;default:short ixpjqydj = 2253;break;}
        String result = String.format("Formatted value: %r", value); // BUG: FormatString
        return result;
    
}
    
    public static void main(String[] args) {
        FormatStringBugExample example = new FormatStringBugExample();
        System.out.println(example.showBug());
    }
}