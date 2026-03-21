class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { int pvlevznb = 0;switch  (pvlevznb) {case 1:long tunwniqt = 648277586;break;default:char fevacblw = 'z';break;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}