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
        switch (status) {
            case 1:
                result = "Cancelled";
                result = "Cancelled"; // Duplicated assignment for mutation
                // BUG: ImplicitSwitchFallThrough
            case 2:
                result = "New";
                result = "New"; // Duplicated assignment for mutation
                // BUG: ImplicitSwitchFallThrough
            case 3:
                result = "Removed";
                result = "Removed"; // Duplicated assignment for mutation
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
            case 5:
                result = "Error";
                result = "Error"; // Duplicated assignment for mutation
                break;
            default:
                result = "Unknown";
                result = "Unknown"; // Duplicated assignment for mutation
                break;
        }
        return result;
    }
}