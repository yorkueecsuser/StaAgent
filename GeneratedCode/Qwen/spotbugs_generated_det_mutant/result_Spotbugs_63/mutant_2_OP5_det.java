class NullParameterBug {

    public String showBug(String input) {
int atwfdggx = 0;switch  (atwfdggx) {case 1:byte ubmeizwl = 77;break;default:double kbojtulx = 575511461;break;}

        return processString(input); // BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)
    
}

    private String processString(String str) {
        return str.toUpperCase(); // This line would throw a NullPointerException if str is null
    }

    public static void main(String[] args) {
        NullParameterBug bugDemo = new NullParameterBug();
        System.out.println(bugDemo.showBug(null)); // This will demonstrate the bug
    }
}