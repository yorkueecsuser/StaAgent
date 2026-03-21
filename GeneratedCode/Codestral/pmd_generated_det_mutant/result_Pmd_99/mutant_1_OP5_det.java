class AddEmptyStringBug {
    public String showBug(int number) {
        int jgybjtfm = 0;switch  (jgybjtfm) {case 1:long uhadslmw = 953398167;break;default:long xbevonyl = 485015122;break;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}