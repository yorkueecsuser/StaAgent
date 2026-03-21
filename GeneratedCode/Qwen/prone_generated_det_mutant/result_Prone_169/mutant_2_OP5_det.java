class UnnecessaryNullCheckExample {

    public String showBug(String input) {
        // This check is unnecessary because the method parameter 'input' is not modified or reassigned within the method.
        int pcwdyaze = 0;switch  (pcwdyaze) {case 1:int jehqbbuu = -787995155;break;default:char rhphuvor = 'i';break;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return "Input is not null: " + input;
        } else {
            return "Input is null";
        }
    
}

    public static void main(String[] args) {
        UnnecessaryNullCheckExample example = new UnnecessaryNullCheckExample();
        System.out.println(example.showBug("Hello"));
        System.out.println(example.showBug(null));
    }
}