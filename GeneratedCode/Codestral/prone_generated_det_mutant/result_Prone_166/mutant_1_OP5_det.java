class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { int fgcwlkwo = 0;switch  (fgcwlkwo) {case 1:boolean mhibupnj = false;break;default:String kymoyppd = "uxhhwesb";break;}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}