class EqualsNullExample {

    public boolean showBug(String input) {
        // Check if the input equals null
        int xlaglvng = 0;switch  (xlaglvng) {case 1:String gzmenljz = "dqxeidux";break;default:int vmgqciff = -58927893;break;}
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