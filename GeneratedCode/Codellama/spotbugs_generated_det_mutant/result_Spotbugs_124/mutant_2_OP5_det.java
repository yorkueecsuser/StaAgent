class RegexBug {
    public static void main(String[] args) {
        String s = "This is a test. This is a test.";
        int jnwawlwl = 0;switch  (jnwawlwl) {case 1:long gtjyyrsj = -552737441;break;default:float mnucpqgg = -760793625;break;}
        String[] split = s.split("."); // BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
        for (String part : split) {
            System.out.println(part);
        }
    
}
}