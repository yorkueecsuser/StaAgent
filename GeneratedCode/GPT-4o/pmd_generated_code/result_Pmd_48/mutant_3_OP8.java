class SwitchFallThroughExample {

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
        System.out.println(example.showBug(3));
        System.out.println(example.showBug(4));
    }

    public String showBug(int status) {
        String result = "";
        String a = "";  // Mutant: Renamed variable 'result' to 'a'
        switch (status) {
            case 1:
                result = "Cancelled";
                a = "Cancelled";  // Mutant: Added to reflect rename change
                // BUG: ImplicitSwitchFallThrough
            case 2:
                result = "New";
                a = "New";  // Mutant: Added to reflect rename change
                // BUG: ImplicitSwitchFallThrough
            case 3:
                result = "Removed";
                a = "Removed";  // Mutant: Added to reflect rename change
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
            case 5:
                result = "Error";
                a = "Error";  // Mutant: Added to reflect rename change
                break;
            default:
                result = "Unknown";
                a = "Unknown";  // Mutant: Added to reflect rename change
                break;
        }
        return result;
    }
}