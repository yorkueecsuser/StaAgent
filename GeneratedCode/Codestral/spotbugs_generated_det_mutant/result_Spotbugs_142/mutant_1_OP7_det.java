class Main {
    public boolean showBug(Integer value1, Integer value2) {
boolean fyfbdkxo = false;while (fyfbdkxo && false && false && false && false && false && false && true && true && true && false && false) {long mhrnqkco = -353139248;}

        return value1.equals(value2); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    
}

    public static void main(String[] args) {
        Main main = new Main();
        Integer negativeValue = -1;
        Integer nonNegativeValue = 1;
        System.out.println(main.showBug(negativeValue, nonNegativeValue));
    }
}