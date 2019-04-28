package Tagi;

public class Tag {

    private String title;

    public Tag() {

    }

    public Tag(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "title='" + title + '\'' +
                '}';
    }
}
