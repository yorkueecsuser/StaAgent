class Main {
    public boolean showBug(Integer value1, Integer value2) {
int zwnwgrdf = 0;switch  (zwnwgrdf) {case 1:String gdlerclc = "yqilcxwt";break;default:int twgjkofh = 843203669;break;}

        return value1.equals(value2); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    
}

    public static void main(String[] args) {
        Main main = new Main();
        Integer negativeValue = -1;
        Integer nonNegativeValue = 1;
        System.out.println(main.showBug(negativeValue, nonNegativeValue));
    }
}