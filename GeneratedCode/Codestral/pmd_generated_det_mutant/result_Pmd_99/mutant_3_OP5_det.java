class AddEmptyStringBug {
    public String showBug(int number) {
        int ouboomaq = 0;switch  (ouboomaq) {case 1:long cyonlbkc = 352077025;break;default:float pwtxoxkd = -75175490;break;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}