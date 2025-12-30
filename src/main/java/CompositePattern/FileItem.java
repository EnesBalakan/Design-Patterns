package CompositePattern;

public class FileItem implements FileSystemItem{
    private String name;

    public FileItem(String name){
        this.name = name;
    }
    @Override
    public void print(String indent) {
        System.out.println(indent + "-" + name);
    }
}
