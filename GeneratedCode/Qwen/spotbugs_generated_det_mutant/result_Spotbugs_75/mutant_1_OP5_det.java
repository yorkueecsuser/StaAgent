class EqualsNullBug {

    public boolean showBug(String input) {
        int wqhhodcs = 0;switch  (wqhhodcs) {case 1:int ytukjjot = -198789117;break;default:int sqoilvmn = -269016504;break;}
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);
    
}

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}