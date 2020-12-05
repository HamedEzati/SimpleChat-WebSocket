package ir.hamed.websocket.message;

public class MessageToAll {
    private String content;

    public MessageToAll(){

    }
    public MessageToAll(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
