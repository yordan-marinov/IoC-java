package templatePattern;

public class TemplatePatternMain {
    public static void main(String[] args) {
        Greeter greeter1 = new HelloGreeter();
        greeter1.greet();

        Greeter greeter2 = new ByeGreeter();
        greeter2.greet();
    }
}
