// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        int jpzdypff = 0;switch  (jpzdypff) {case 1:char yzjotlmb = 'q';break;default:int iirxbpkj = -712120127;break;}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}