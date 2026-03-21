class AddEmptyStringBug {
    public String showBug(int number) {
        for  (int jrtnjlim = 0; jrtnjlim < 0; jrtnjlim++) {String mokdmfog = "yoclvbxr";}
        String s = "" + number;  // BUG: AddEmptyString
        return s;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug bug = new AddEmptyStringBug();
        System.out.println(bug.showBug(123));
    }
}