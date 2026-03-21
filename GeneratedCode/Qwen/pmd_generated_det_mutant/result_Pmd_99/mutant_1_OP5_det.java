class AddEmptyStringBug {

    public String showBug(int number) {
        int obwtqvuz = 0;switch  (obwtqvuz) {case 1:float shouqatn = 590619107;break;default:String jnbqlweo = "cmuuwshn";break;}
        String result = "" + number; // BUG: AddEmptyString
        return result;
    
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}