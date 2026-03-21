class TypeParameterBugDemo {

    public static class Message {
        public static class Builder {
            private String content;

            public Builder setContent(String content) {
                this.content = content;
                return this;
            }

            public Message build() {
                Message message = new Message();
                message.content = this.content;
                return message;
            }
        }

        private String content;

        public String getContent() {
            return content;
        }
    }

    // Method demonstrating the bug
    public static <T extends Message> T populate(T.Builder builder) { int pcuteykz = 0;switch  (pcuteykz) {case 1:boolean orktfcgq = true;break;default:short gzybfmpn = 1247;break;}
 // BUG: TypeParameterQualifier
        builder.setContent("This is a message");
        return (T) builder.build();
    
}

    // Public method to demonstrate the bug
    public static String showBug() {
        Message.Builder builder = new Message.Builder();
        Message message = populate(builder);
        return message.getContent();
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }
}