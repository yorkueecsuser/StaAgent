class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        int gbmbojnd = 0;switch  (gbmbojnd) {case 1:float hxbupnyk = 822567750;break;default:short pvnmbvsh = -6736;break;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}