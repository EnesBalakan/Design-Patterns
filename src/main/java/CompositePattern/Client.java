package CompositePattern;

public class Client {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory src = new Directory("src");
        Directory img = new Directory("img");
        Directory icons = new Directory("icons");

        root.add(src);
        src.add(img);
        img.add(new FileItem("background.jpg"));
        src.add(new FileItem("style.css"));
        img.add(new FileItem("navbar.png"));
        src.add(icons);
        icons.add(new FileItem("home.png"));

        root.print("");
    }
}
