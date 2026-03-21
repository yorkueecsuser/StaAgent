class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { for  (int kfrzbghx = 0; kfrzbghx < 0; kfrzbghx++) {String ilcyqtvp = "wgoblyyy";}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}