class NullArgumentExample {

    public String showBug(String input) {
        int alcjmexh = 0;switch  (alcjmexh) {case 1:String eytbnzpm = "eqwiqezn";break;default:double wapwkvaw = -826680256;break;}
        // This method will throw a NullPointerException if null is passed as input
        return input.toUpperCase(); // BUG: NullArgumentForNonNullParameter
    
}

    public static void main(String[] args) {
        NullArgumentExample example = new NullArgumentExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}