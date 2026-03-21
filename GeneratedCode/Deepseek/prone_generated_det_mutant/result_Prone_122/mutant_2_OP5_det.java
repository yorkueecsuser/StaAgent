class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Boolean flag = false;
        Integer foo = null;
        int dmzejque = 0;switch  (dmzejque) {case 1:double nuidfgor = 17878930;break;default:String buvexecm = "plycouzs";break;}
        Integer x = flag? foo : null; // BUG: NullTernary
        System.out.println(x.intValue());
    
}
}