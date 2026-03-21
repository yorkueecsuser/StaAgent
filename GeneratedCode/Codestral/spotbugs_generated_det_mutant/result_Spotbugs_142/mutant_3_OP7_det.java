class Main {
    public boolean showBug(Integer value1, Integer value2) {
boolean wpsqueef = false;while (wpsqueef && false && false && true && true && false && false && true && false && true && false && false) {float piudukex = -890902669;}

        return value1.equals(value2); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    
}

    public static void main(String[] args) {
        Main main = new Main();
        Integer negativeValue = -1;
        Integer nonNegativeValue = 1;
        System.out.println(main.showBug(negativeValue, nonNegativeValue));
    }
}