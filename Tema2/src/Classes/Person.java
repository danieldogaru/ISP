package Classes;

public class Person {
    private String role;
    private String name;

    public Person(String role, String name) {
        this.role = role;
        this.name = name;
    }

    public String getRole() {

        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
