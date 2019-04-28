package Tagi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Post implements AddTagAble {
    private String title;
    private String author;
    private Set<Tag> tagList = new HashSet<>();

    public Post() {

    }

    public Post(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", tagList=" + tagList +
                '}';
    }

    @Override
    public void addTag(Tag tag){

        boolean index = false;

        for (Tag tag1 : tagList){
            if (tag1.getTitle().equals(tag.getTitle())){
                index = true;
            }

            if (!index){
                tagList.add(tag);
            }
        }
    }
}
