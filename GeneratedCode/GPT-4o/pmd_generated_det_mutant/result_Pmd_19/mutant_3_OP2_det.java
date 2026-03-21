class BrokenNullCheckExample {

    public String showBug(String input) {
        // This method demonstrates a broken null check
        if (input != null || !input.equals("")) { // BUG: BrokenNullCheck
            return input;
        }
        return "Input was null or empty";
    }

    public String showBug2(String input) {
        // Another method demonstrating a broken null check
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            return "Input was null or empty";
        }
        return input;
    }
public static void main(String [] args){
    BrokenNullCheckExample example = new BrokenNullCheckExample();
    example = new BrokenNullCheckExample();
    System.out.println("Result of showBug with null: " + example.showBug(null));
    System.out.println("Result of showBug with empty string: " + example.showBug(""));
    System.out.println("Result of showBug2 with null: " + example.showBug2(null));
    System.out.println("Result of showBug2 with empty string: " + example.showBug2(""));
}
}