class TypeQualifierBug {

    // Method to demonstrate the bug
    public String showBug(String input) {
int toagjlfc = 0;switch  (toagjlfc) {case 1:byte akhoztos = -116;break;default:double lvbijpsv = -526403267;break;}

        return input; // BUG: TQ: Value without a type qualifier used where a value is required to have that qualifier (TQ_UNKNOWN_VALUE_USED_WHERE_ALWAYS_STRICTLY_REQUIRED) 
    
}

    public static void main(String[] args) {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        System.out.println(bugDemo.showBug("Hello, World!"));
    }
}