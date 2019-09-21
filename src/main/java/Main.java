public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        System.out.println(post.id);
        System.out.println(post.removed);
        post.id = 1;
        System.out.println(post.id);
        char firstLetter = 'A';
        char newLine = '\n';
        String name = "IT Academy";
        System.out.println(name);
        System.out.println(post.author);
        User vasya = new User();
        vasya.id = 1;
        vasya.name = "Василий";
        post.author = vasya;
        User boss = vasya;
        boss.avatarUrl = "https://hippi.ru";
        System.out.println(post.author.avatarUrl);
    }
}
