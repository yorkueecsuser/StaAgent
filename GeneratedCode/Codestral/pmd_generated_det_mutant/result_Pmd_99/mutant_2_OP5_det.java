class AddEmptyStringBug {
    public String showBug(int number) {
        int vknifwhq = 0;switch  (vknifwhq) {case 1:boolean uutmkwwd = true;break;default:float vxwdbbka = -201122631;break;}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}