class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { if (true && false && true && false && false && false && true && true && true && false && false) {boolean ljvxhagl = true;}else{float eobkjokc = -6161537;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}