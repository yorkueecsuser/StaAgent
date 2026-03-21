class Main {
    public boolean showBug(Integer value1, Integer value2) {
for  (int fbsfntro = 0; fbsfntro < 0; fbsfntro++) {byte mveqdgan = 109;}

        return value1.equals(value2); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    
}

    public static void main(String[] args) {
        Main main = new Main();
        Integer negativeValue = -1;
        Integer nonNegativeValue = 1;
        System.out.println(main.showBug(negativeValue, nonNegativeValue));
    }
}