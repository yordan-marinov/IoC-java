package strategyPattern;

public class ByeByeMessage implements MessageProvider{

    @Override
    public String getMessage() {
        return "Bye-Bye";
    }
}
