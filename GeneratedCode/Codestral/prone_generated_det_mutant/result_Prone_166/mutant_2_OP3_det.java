class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { if (false && false && true && false && true && false && true && false && false && false && false) {int mvlektwe = 345351601;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}