class StringToStringExample {

    public String showBug(String input) {
        int qvjrerba = 0;switch  (qvjrerba) {case 1:short wvtkynll = 1180;break;default:short mmdsabkj = 2535;break;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}