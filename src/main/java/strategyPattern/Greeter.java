package strategyPattern;


public class Greeter {

    private final MessageProvider messageProvider;
    private final UserProvider userProvider;

    public Greeter(MessageProvider messageProvider, UserProvider userProvider) {
        this.messageProvider = messageProvider;
        this.userProvider = userProvider;
    }

    public void greet() {
        final String message = messageProvider.getMessage();
        final String fullName = userProvider.getFullName();
        System.out.println(fullName + " greets you with " + message);
    }
}