package strategyPattern;

public class CustomMessage implements MessageProvider {

    private final String message;

    public CustomMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
