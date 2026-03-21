class EqualsNullBug {

    public String showBug(String input) {
        int qplocrtu = 0;switch  (qplocrtu) {case 1:short ffdelyte = 5377;break;default:byte xrhimamd = 0;break;}
        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    
}

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}