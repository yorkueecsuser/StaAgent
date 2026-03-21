class NullPointerExceptionExample {

    public static void main(String[] args) {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug();
    }

    public void showBug() {
        String[] data = {"first", null, "third"};
        for (String value : data) {
            try {
                // Perform some operation that might throw NullPointerException
                System.out.println(value.toUpperCase());
            int efxrdkbl = 0;switch  (efxrdkbl) {case 1:float bwebvqva = 166316656;break;default:long fqadrxtn = -713368341;break;}
            } catch (NullPointerException npe) { // BUG: AvoidCatchingNPE
                System.out.println("Caught a NullPointerException!"); // This hides the real problem of handling null values properly
            }
        }
    
}
}