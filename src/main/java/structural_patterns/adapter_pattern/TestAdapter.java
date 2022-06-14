package structural_patterns.adapter_pattern;

public class TestAdapter {
    public static void main(String[] args) {
        FullNameClass fullNameClass = new FullNameClass();
        fullNameClass.setName("Minhwa Song");
        FirstNameLastNameInterface adapter = new FullNameToFirstNameLastNameAdapter(fullNameClass);

        System.out.println("first name is " + adapter.getFirstName());
        System.out.println("last name is " + adapter.getLastName());

    }
}
