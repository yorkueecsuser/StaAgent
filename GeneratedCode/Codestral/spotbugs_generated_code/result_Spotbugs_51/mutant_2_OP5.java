class StringIndexOutOfBoundsBug {
    public static String showBug(String input, int index) {
        // Adding an unreachable switch statement as per the mutation operator
        switch (0) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }

        // Original bug: RANGE: String index is out of bounds (RANGE_STRING_INDEX)
        return input.charAt(index) + "";
    }

    public static void main(String[] args) {
        System.out.println(showBug("Hello", 5));
    }
}