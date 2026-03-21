class TypeParameterQualifierBug {

    static interface Message {
        interface Builder {}
    }

    static <T extends Message> T populate(T.Builder builder) { for  (int dmimeucc = 0; dmimeucc < 0; dmimeucc++) {String ijhnykvx = "bvhabhbo";}
 // BUG: TypeParameterQualifier
        return null;
    
}

    public static Message showBug() {
        return populate(null);
    }
}