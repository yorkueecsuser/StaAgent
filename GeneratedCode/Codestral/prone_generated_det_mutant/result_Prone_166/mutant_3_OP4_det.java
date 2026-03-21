class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { if (false && false && false && true && false && false && false && true && true && false && false) {long qkgdzaxh = -10742827;}else{int qvcxgcxi = -961640064;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}