class UselessStringBug {

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        int xuixkurc = 0;switch  (xuixkurc) {case 1:byte icwugqyb = 121;break;default:float bexvcdlj = -690683281;break;}
        String result = new int[] {1, 2, 3}.toString();
        return result;
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}