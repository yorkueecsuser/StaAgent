class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { if (true && true && true && true && true && false && false && false && true && true && false) {char svskuogz = 'y';}else{double frmjigba = 213381795;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}