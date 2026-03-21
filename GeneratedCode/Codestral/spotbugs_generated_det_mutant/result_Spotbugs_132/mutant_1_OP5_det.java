class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        int oeqhavfp = 0;switch  (oeqhavfp) {case 1:String ygxfjsbp = "bfuxlrrl";break;default:boolean jhmcenwm = false;break;}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}