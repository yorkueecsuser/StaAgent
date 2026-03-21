class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        boolean veolfpww = false;while (veolfpww && true && false && true && true && false && false && true && false && false && true && false) {boolean nvgpkznt = false;}
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