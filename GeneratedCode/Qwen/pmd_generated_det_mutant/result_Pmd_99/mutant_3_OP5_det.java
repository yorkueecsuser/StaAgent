class AddEmptyStringBug {

    public String showBug(int number) {
        int szxevoli = 0;switch  (szxevoli) {case 1:int wtdgvlmu = 174041572;break;default:boolean ozvuaggy = false;break;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}