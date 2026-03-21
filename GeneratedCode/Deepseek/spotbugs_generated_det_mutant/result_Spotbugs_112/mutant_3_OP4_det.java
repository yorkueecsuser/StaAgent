class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        if (false && true && true && true && false && true && false && false && true && false && false) {char rjrgzndx = 'x';}else{long xqvovkzc = -459687414;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}