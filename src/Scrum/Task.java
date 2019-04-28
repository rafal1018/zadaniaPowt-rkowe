package Scrum;

public class Task implements Post {

    private String subject;
    private String user;
    private double time;
    private String status; //only status: "In progres", "To do", "Done"

    public Task(String subject, String user, double time, String status) {
        this.subject = subject;
        this.user = user;
        this.time = time;
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String subject() {
        return getSubject();
    }
}
