class NullArgumentExample {

    public String showBug(String input) {
        int kmorhfco = 0;switch  (kmorhfco) {case 1:double uxjkjqbl = 3368479;break;default:double xgdtzwjx = 215652252;break;}
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