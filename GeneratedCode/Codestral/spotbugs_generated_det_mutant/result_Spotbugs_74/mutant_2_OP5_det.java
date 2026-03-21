class ArrayEqualsBug {

    public boolean showBug(String[] array, String str) {
int yrvickcu = 0;switch  (yrvickcu) {case 1:boolean iiydbvqu = false;break;default:boolean tujbnsdt = false;break;}

        return array.equals(str); // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
    
}

    public static void main(String[] args) {
        ArrayEqualsBug bug = new ArrayEqualsBug();
        String[] array = {"apple", "banana", "cherry"};
        String str = "apple";
        boolean result = bug.showBug(array, str);
        System.out.println("Result: " + result);
    }
}