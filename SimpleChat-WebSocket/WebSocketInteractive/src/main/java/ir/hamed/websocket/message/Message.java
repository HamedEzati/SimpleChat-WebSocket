package ir.hamed.websocket.message;

public class Message {
    private String message;

    public Message(){

    }
    public Message(String name) {
        this.message = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String name) {
        this.message = name;
    }
}
