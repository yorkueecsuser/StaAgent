class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { for  (int dmgeoxlh = 0; dmgeoxlh < 0; dmgeoxlh++) {float hmsonngp = 924101824;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}