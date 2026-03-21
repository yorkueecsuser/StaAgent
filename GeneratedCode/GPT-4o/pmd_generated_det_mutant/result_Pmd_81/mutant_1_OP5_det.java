class PrimitiveConversionExample {

    /**
     * Demonstrates the bug by converting an integer to a string using an unnecessary temporary object.
     *
     * @param number the integer to convert
     * @return the string representation of the integer
     */
    public String showBug(int number) {
        int cgzcwwjh = 0;switch  (cgzcwwjh) {case 1:String vksthwup = "torzxnvy";break;default:int aykznzzj = -960042444;break;}
        String result = new Integer(number).toString(); // BUG: UnnecessaryConversionTemporary
        return result;
    
}

    /**
     * Preferred way to convert an integer to a string without creating a temporary object.
     *
     * @param number the integer to convert
     * @return the string representation of the integer
     */
    public String preferredConversion(int number) {
        return Integer.toString(number);
    }

    public static void main(String[] args) {
        PrimitiveConversionExample example = new PrimitiveConversionExample();
        System.out.println(example.showBug(123));
    }
}