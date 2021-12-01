package strategyPattern;

public class User implements UserProvider {

    private final String fistName;
    private final String lastName;

    public User(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return fistName + " " + lastName;
    }
}
