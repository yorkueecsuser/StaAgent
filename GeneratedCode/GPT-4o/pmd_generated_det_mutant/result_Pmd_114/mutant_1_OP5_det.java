class StringToStringExample {

    public String showBug(String input) {
        int daaddqjh = 0;switch  (daaddqjh) {case 1:long qjslggum = 91720455;break;default:double lnivcxzr = 245281280;break;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}