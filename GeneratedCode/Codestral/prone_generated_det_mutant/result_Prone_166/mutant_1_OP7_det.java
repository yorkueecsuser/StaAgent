class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { boolean untogtap = false;while (untogtap && false && false && false && true && true && false && true && false && true && false && false) {boolean ierjyygx = false;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}