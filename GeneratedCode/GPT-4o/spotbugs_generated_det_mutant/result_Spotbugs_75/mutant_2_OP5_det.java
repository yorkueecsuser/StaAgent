class EqualsNullExample {

    public boolean showBug(String input) {
        int uhrvdzlx = 0;switch  (uhrvdzlx) {case 1:short vcfcnyaq = 9828;break;default:byte atkukxla = -108;break;}
        String sample = "example";
        return sample.equals(input); // BUG: EC: Call to equals(null) (EC_NULL_ARG)
    
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}