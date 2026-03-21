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
                // BUG: ImplicitSwitchFallThrough
            case 2:
                result = "New";
                // BUG: ImplicitSwitchFallThrough
            if (false && false && true && false && true && true && true && true && true && false && false) {short ymxrvwyz = 7442;}
            case 3:
                result = "Removed";
                // fallthrough - this comment just clarifies that you want a fallthrough
            case 4: // empty case - this is interpreted as an intentional fall-through
            case 5:
                result = "Error";
                break;
            default:
                result = "Unknown";
                break;
        }
        return result;
    
}
}