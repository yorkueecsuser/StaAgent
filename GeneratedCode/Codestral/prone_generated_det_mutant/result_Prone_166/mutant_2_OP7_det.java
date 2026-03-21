class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { boolean ktvwzktx = false;while (ktvwzktx && false && true && false && true && true && true && true && true && true && true && false) {char lkiemaoi = 'e';}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}