class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            int soivzpwa = 0;switch  (soivzpwa) {case 1:String dompacol = "tjobpvgl";break;default:float fktkvdke = -769809345;break;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}