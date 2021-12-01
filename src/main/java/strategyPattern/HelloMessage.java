package strategyPattern;

public class HelloMessage implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello";
    }
}
