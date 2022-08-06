package structural_patterns.template_method_pattern;

public class CookieRobot extends RobotTemplate{

    private final String name;

    public CookieRobot(String n){
        this.name = n;
    }

    public void getParts(){
        System.out.println("getting flour and sugar...");
    }

    public void assemble(){
        System.out.println("baking a cookie...");
    }

    public void test(){
        System.out.println("crunching a cookie...");
    }

    public String getName(){
        return name;
    }
}
