package Tagi;

public class Main {
    public static void main(String[] args) {
        Post post = new Post("Pogramowanie jest super", "michalos");
        post.addTag(new Tag("programowanie"));
        post.addTag(new Tag("java"));
        post.addTag(new Tag("programowanie"));

        System.out.println(post);
    }

}

