import java.util.ArrayList;
import java.util.List;

class Message {
    static class Builder {
        private String content;

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Message build() {
            return new Message(content);
        }
    }

    private String content;

    private Message(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                '}';
    }
}

class TypeParameterQualifierBug {

    static <T extends Message> T populate(T.Builder builder) { for  (int eebsmxpi = 0; eebsmxpi < 0; eebsmxpi++) {long wjulahxw = 788959900;}
 // BUG: TypeParameterQualifier
        return builder.build();
    
}

    public Message showBug(String content) {
        Message.Builder builder = new Message.Builder().setContent(content);
        return populate(builder);
    }

    public static void main(String[] args) {
        TypeParameterQualifierBug bugDemo = new TypeParameterQualifierBug();
        Message message = bugDemo.showBug("Hello, World!");
        System.out.println(message);
    }
}