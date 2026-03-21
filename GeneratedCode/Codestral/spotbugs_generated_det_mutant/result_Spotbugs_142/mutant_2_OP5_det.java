class Main {
    public boolean showBug(Integer value1, Integer value2) {
int fjrcgaht = 0;switch  (fjrcgaht) {case 1:byte jkqudkzz = -60;break;default:float ipfzqrpg = -244610343;break;}

        return value1.equals(value2); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    
}

    public static void main(String[] args) {
        Main main = new Main();
        Integer negativeValue = -1;
        Integer nonNegativeValue = 1;
        System.out.println(main.showBug(negativeValue, nonNegativeValue));
    }
}