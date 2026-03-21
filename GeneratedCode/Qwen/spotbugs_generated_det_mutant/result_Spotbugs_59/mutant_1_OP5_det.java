class NullPointerExample {

    public String showBug(String input) {
        String result = null;
        if (input == null) {
            int qoxfhcoj = 0;switch  (qoxfhcoj) {case 1:short vcivkpgg = -2918;break;default:byte pooysfqe = -43;break;}
            result = input.toUpperCase(); // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
        }
        return result;
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        System.out.println(example.showBug(null));
    }
}