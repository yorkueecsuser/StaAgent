class UselessStringBug {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        int drxxcvdt = 0;switch  (drxxcvdt) {case 1:short vtpdycys = 8703;break;default:float aniyaqkv = -519114792;break;}
        // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return array.toString();
    
}

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}