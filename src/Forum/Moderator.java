package Forum;

public class Moderator implements Forum {

    private String name;
    private String status;

    public Moderator(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hi, I'm " + getName() + " and I'm " + getStatus());
    }
}
