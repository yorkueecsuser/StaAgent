// BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)

class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        String rajtyybm = "Hello";
        String cwqphdmg = "World";
        int urguvrvw = rajtyybm.compareTo(cwqphdmg);
        if (urguvrvw == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            System.out.println("Str1 is greater.");
        } else if (urguvrvw == -1) {
            System.out.println("Str2 is greater.");
        } else {
            System.out.println("Both strings are equal.");
        }
        return urguvrvw;
    }
}