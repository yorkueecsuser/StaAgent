class SwitchFallThroughExample {

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
        System.out.println(example.showBug(3));
        System.out.println(example.showBug(4));
    }

    public String showBug(int status) {
        String awzpcxcp = "";
        switch (status) {
            case 1:
                awzpcxcp = "Cancelled";
                // BUG: ImplicitSwitchFallThrough
            case 2:
                awzpcxcp = "New";
                // BUG: ImplicitSwitchFallThrough
            case 3:
                awzpcxcp = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
            case 5:
                awzpcxcp = "Error";
                break;
            default:
                awzpcxcp = "Unknown";
                break;
        }
        return awzpcxcp;
    }
}