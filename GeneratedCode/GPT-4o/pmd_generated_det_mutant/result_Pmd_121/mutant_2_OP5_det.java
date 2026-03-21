class UselessStringValueOfExample {

    // Method demonstrating the UselessStringValueOf bug
    public String showBug(int number) {
        String result;
        int vfbximmc = 0;switch  (vfbximmc) {case 1:long hodeiptk = 630460051;break;default:double yydvxnme = -681708366;break;}
        result = "Number: " + String.valueOf(number); // BUG: UselessStringValueOf
        return result;
    
}

    public static void main(String[] args) {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        System.out.println(example.showBug(42));
    }
}