class StringIndexOutOfBoundsBug {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 15; // BUG: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        System.out.println(str.substring(index));

        // Unreachable switch statement mutation
        boolean unreachableSwitchCondition = false;
        switch (unreachableSwitchCondition) {
            case true:
                System.out.println("This code is unreachable");
                break;
            case false:
                System.out.println("This code is also unreachable");
                break;
            default:
                System.out.println("This is the default branch, but it's also unreachable");
                break;
        }
    }
}