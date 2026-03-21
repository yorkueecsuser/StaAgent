class EqualsNullBug {

    public boolean showBug(String input) {
        int mfakefuj = 0;switch  (mfakefuj) {case 1:long kyjbljtb = 247799243;break;default:short cdonzfon = -2224;break;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}