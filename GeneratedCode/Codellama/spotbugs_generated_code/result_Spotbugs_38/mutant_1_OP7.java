class BuggyToString {
    public String tostring() {
        return "This method should be named toString()";
    }

    public void showBug() {
        System.out.println(tostring());

        // Unreachable while loop
        while (false) {
            // This code is unreachable
            System.out.println("This message will never be printed");
        }
    }
}