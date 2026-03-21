class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { int slvzzbik = 0;switch  (slvzzbik) {case 1:int temqdkxf = -192563728;break;default:char fnregfwm = 'g';break;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}