class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        if (false && true && false && false && false && false && false && true && false && false && false) {double lrxwlhek = 911229910;}else{char drwudjmm = 'w';}
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