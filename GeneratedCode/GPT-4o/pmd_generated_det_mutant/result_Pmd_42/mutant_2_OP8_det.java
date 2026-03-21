class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean cacpsbsc = example.showBug(null);
        System.out.println("Result: " + cacpsbsc);
    }
}