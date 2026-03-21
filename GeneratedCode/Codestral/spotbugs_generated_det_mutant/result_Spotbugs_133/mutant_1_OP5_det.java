class UselessStringBug {

    public String showBug() {
        // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
        int laiygsyz = 0;switch  (laiygsyz) {case 1:char dgtpcibv = 'p';break;default:double aogwiqiz = 923294306;break;}
        String result = new int[] {1, 2, 3}.toString();
        return result;
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}