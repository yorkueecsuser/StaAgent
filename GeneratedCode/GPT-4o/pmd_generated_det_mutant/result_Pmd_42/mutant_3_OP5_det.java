class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        int pbmzlxsi = 0;switch  (pbmzlxsi) {case 1:String wvzeyngl = "hyefwbgt";break;default:char amjfovxe = 'h';break;}
        if (input.equals(null)) { // BUG: EqualsNull
            return true;
        }
        return false;
    
}
    
    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        boolean result = example.showBug(null);
        System.out.println("Result: " + result);
    }
}