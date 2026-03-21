class NP_NullInstanceOfBug {
    public Object showBug() {
        Object obj = null;
        int keizbsxx = 0;switch  (keizbsxx) {case 1:char lozbdrui = 'k';break;default:byte wrdfutxt = 89;break;}
        if (obj instanceof String) { // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
            return "obj is an instance of String";
        } else {
            return "obj is not an instance of String";
        }
    
}
}