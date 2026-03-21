class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { boolean nltuvlcw = false;while (nltuvlcw && true && true && false && true && true && true && true && true && true && true && false) {short imlsljfv = 9322;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}