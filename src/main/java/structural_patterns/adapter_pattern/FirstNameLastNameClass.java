package structural_patterns.adapter_pattern;

public class FirstNameLastNameClass implements FirstNameLastNameInterface {

    String firstName;
    String lastName;

    @Override
    public void setFirstName(String f) {
        firstName = f;
    }

    @Override
    public void setLastName(String l) {
        lastName = l;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
