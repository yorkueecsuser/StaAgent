class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
    }

    public int showBug(String input) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is also unreachable.");
        }
        
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if-else branches unreachable.
        return false;
    }
}