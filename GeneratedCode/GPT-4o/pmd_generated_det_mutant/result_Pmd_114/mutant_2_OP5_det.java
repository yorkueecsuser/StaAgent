class StringToStringExample {

    public String showBug(String input) {
        int weomtnfm = 0;switch  (weomtnfm) {case 1:float onevigyy = -496127717;break;default:String gmtkszmk = "ptbniwbk";break;}
        // The bug here is calling toString() on a String object, which is unnecessary
        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringExample example = new StringToStringExample();
        System.out.println(example.showBug("Hello"));
    }
}