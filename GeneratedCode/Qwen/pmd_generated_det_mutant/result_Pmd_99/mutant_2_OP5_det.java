class AddEmptyStringBug {

    public String showBug(int number) {
        int mjwaqhzr = 0;switch  (mjwaqhzr) {case 1:String kbwnjgzm = "rpxhwbyn";break;default:int ysiagrei = -899574043;break;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}