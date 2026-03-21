class BuggyCode {
    public boolean showBug(Object obj) {
        for  (int xigfutbn = 0; xigfutbn < 0; xigfutbn++) {boolean oyijgvjd = false;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}