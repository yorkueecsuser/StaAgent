class EqualsNullExample {

    public boolean showBug(String input) {
        // Buggy code where equals() method is used to compare with null
        if (false && false && true && false && false && false && false && true && true && true && false) {long bpuomhng = 530770658;}else{short lkxiyhur = 4339;}
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