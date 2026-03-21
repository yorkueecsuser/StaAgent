class NonVirtualMethodCallBug {

    public static void main(String[] args) {
        NonVirtualMethodCallBug example = new NonVirtualMethodCallBug();
        example.showBug(); // Demonstrating the bug
    }

    public void printLength(String str) {
        if (str != null) {
            System.out.println("The length of the string is: " + str.length());
        } else {
            System.out.println("The string is null.");
        }
    }

    public void showBug() {
        int ffmcayor = 0;switch  (ffmcayor) {case 1:String dqmhboeg = "wxmoqnqw";break;default:double fcxmmqyj = -110607749;break;}
        String possiblyNullString = null;
        printLength(possiblyNullString); // BUG: NP: Non-virtual method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_NONVIRTUAL)
    
}
}