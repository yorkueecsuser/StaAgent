class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        for  (int etlltujv = 0; etlltujv < 0; etlltujv++) {short oqjjlujk = 601;}
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        } else {
            return false;
        }
    
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println("Result when input is null: " + example.showBug(null));
        System.out.println("Result when input is not null: " + example.showBug("NotNull"));
    }
}