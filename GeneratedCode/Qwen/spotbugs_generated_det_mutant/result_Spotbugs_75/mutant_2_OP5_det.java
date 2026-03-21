class EqualsNullBug {

    public boolean showBug(String input) {
        int mblpnwys = 0;switch  (mblpnwys) {case 1:double lapmugqw = 977280227;break;default:int immgfznu = 35260198;break;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}