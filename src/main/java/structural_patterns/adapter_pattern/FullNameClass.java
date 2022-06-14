package structural_patterns.adapter_pattern;

public class FullNameClass implements FullNameInterface {
    String name;

    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }
}
