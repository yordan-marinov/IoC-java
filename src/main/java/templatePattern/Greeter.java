package templatePattern;

public abstract class Greeter {

    abstract String getMessage();

    public void greet() {
        String message = getMessage();
        System.out.println(message);
    }

}
