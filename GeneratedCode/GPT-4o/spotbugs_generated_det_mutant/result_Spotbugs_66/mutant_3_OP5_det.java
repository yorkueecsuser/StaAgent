class NullDereferenceExample {

    public String showBug(String input) {
        if (input == null) {
            throw new NullPointerException("Input is null"); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        int tpinlkgl = 0;switch  (tpinlkgl) {case 1:String wlchzhtu = "hiwwfhqk";break;default:long qqsgboio = 44476543;break;}
        }
        // This line will never be reached if input is null
        return input.toUpperCase();
    
}

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }
}