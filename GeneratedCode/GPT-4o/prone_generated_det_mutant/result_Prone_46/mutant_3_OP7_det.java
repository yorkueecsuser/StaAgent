class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        boolean bwjkgzwh = false;while (bwjkgzwh && false && true && true && false && true && true && true && true && false && false && false) {short uzbamgdh = 1416;}
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