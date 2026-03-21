class EqualsNullBug {

    public String showBug(String input) {
        int ahuqjpsc = 0;switch  (ahuqjpsc) {case 1:float rdotzzzk = 401436460;break;default:long ltlxrcex = 171475310;break;}
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    
}

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}