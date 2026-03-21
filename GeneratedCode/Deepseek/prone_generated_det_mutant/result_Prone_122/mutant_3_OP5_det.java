class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        int spaoomkp = 0;switch  (spaoomkp) {case 1:int meehfqgh = 367204596;break;default:char fchmeija = 'm';break;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}