class Main {
    public boolean showBug(Integer value1, Integer value2) {
int hwexkgxb = 0;switch  (hwexkgxb) {case 1:byte stvocxqz = -12;break;default:double qhattsib = -943237838;break;}

        return value1.equals(value2); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    
}

    public static void main(String[] args) {
        Main main = new Main();
        Integer negativeValue = -1;
        Integer nonNegativeValue = 1;
        System.out.println(main.showBug(negativeValue, nonNegativeValue));
    }
}