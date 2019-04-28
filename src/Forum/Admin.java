package Forum;

public class Admin implements Forum {

    private String name;
    private String status;

    public Admin(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hi, I'm " + getName() + " and I'm " + getStatus());
    }
}
