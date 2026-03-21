class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            int azlhehvz = 0;switch  (azlhehvz) {case 1:boolean grgqajcq = false;break;default:String rfgrrlcw = "rmxtakqz";break;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}