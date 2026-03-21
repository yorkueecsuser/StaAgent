class SwitchFallThroughExample {

    public static void main(String[] args) {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        System.out.println(example.showBug(1));
        System.out.println(example.showBug(2));
        System.out.println(example.showBug(3));
        System.out.println(example.showBug(4));
    }

    public String showBug(int status) {
        String ofhobpsd = "";
        switch (status) {
            case 1:
                ofhobpsd = "Cancelled";
                // BUG: ImplicitSwitchFallThrough
            case 2:
                ofhobpsd = "New";
                // BUG: ImplicitSwitchFallThrough
            case 3:
                ofhobpsd = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
            case 5:
                ofhobpsd = "Error";
                break;
            default:
                ofhobpsd = "Unknown";
                break;
        }
        return ofhobpsd;
    }
}