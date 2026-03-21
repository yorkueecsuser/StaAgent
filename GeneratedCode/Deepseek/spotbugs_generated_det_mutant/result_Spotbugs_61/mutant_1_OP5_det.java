// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF)

class NullDereferenceBug {

    public static void showBug(String str) {
        int ykmriyta = 0;switch  (ykmriyta) {case 1:int gmztlvki = -647285580;break;default:float xobkmewo = -787146696;break;}
        System.out.println(str.length());
    
}

    public static void main(String[] args) {
        String str = null;
        showBug(str);
    }
}