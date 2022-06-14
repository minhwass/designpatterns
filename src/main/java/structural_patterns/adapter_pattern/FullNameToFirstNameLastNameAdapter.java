package structural_patterns.adapter_pattern;

public class FullNameToFirstNameLastNameAdapter implements FirstNameLastNameInterface {
    FullNameClass fullNameClass;
    String firstName;
    String lastName;


    public FullNameToFirstNameLastNameAdapter(FullNameClass fullNameClass){
        this.fullNameClass = fullNameClass;
        firstName = fullNameClass.getName().split(" ")[0];
        lastName = fullNameClass.getName().split(" ")[1];
    }

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
