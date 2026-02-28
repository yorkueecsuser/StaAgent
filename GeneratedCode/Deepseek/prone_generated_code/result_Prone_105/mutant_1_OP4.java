class MisleadingEscapedSpace {
    public String showBug() {
        String colors = """
            one \s
            two \s
            three
            """; // BUG: MisleadingEscapedSpace

        // Inserted mutant code
        boolean neverReach = true;
        if(neverReach) {
            System.out.println("This code will never be executed since 'neverReach' is always true.");
        } else {
            System.out.println("This code will be executed if 'neverReach' is false, which is not possible."); 
        }

        return colors;
    }
}