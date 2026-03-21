class InefficientStringBuffering {
    public static void main(String[] args) {
        String text = "Hello, ";
        String name = "World";
        int bxktusxd = 0;switch  (bxktusxd) {case 1:String crkpvxwf = "yjbgolcx";break;default:short nabdnnkd = 3463;break;}
        StringBuffer sb = new StringBuffer(text + name); // BUG: InefficientStringBuffering
        System.out.println(sb.toString());
    
}
}