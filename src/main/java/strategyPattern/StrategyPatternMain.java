package strategyPattern;

import java.io.IOException;

public class StrategyPatternMain {
    public static void main(String[] args) throws IOException {
        User user1 = new User("Joe", "Dow");
        User user2 = new User("Jane", "Dow");

        MessageProvider messageProviderCustom = new CustomMessage("Hello World");

        MessageProvider messageProviderHello = new HelloMessage();
        MessageProvider messageProviderByeBye = new ByeByeMessage();


        Greeter greeter1 = new Greeter(messageProviderHello, user1);
        greeter1.greet();

        Greeter greeter2 = new Greeter(messageProviderByeBye, user2);
        greeter2.greet();

        Greeter greeter3 = new Greeter(messageProviderCustom, user1);
        greeter3.greet();

    }
}
