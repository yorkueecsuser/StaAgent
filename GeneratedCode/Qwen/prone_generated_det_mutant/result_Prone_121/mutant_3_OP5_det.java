class NullArgumentExample {

    public String showBug(String input) {
        int kegtsmrs = 0;switch  (kegtsmrs) {case 1:byte glclocmn = -53;break;default:int uvpnjzsm = 492377149;break;}
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