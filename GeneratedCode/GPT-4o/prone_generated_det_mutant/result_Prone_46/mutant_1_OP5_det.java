class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        int rmuvaxkk = 0;switch  (rmuvaxkk) {case 1:int lmzhsnvc = -18090137;break;default:int prwzrdlz = -820910706;break;}
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