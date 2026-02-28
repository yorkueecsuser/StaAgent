class EqualsNullBug {

    public boolean showBug(String input) {
        // BUG: EC: Call to equals(null) (EC_NULL_ARG) 
        return input.equals(null);

        // Added a unique, non-functional do-while loop as per the mutation operator description
        do {
            // This loop does nothing and is added for mutation purposes
        } while (false);
    }

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}