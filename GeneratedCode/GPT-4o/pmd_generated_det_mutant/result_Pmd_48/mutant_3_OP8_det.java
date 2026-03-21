class SwitchFallThroughExample {

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
        System.out.println(example.showBug(3));
        System.out.println(example.showBug(4));
    }

    public String showBug(int status) {
        String ylgwuumf = "";
        switch (status) {
            case 1:
                ylgwuumf = "Cancelled";
                // BUG: ImplicitSwitchFallThrough
            case 2:
                ylgwuumf = "New";
                // BUG: ImplicitSwitchFallThrough
            case 3:
                ylgwuumf = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
            case 5:
                ylgwuumf = "Error";
                break;
            default:
                ylgwuumf = "Unknown";
                break;
        }
        return ylgwuumf;
    }
}