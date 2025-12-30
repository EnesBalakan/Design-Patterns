package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemItem{
    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item){
        children.add(item);
    }

    public void remove(FileSystemItem item){
        children.remove(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "-" + name);
        for(FileSystemItem child : children){
            child.print(indent + " ");
        }
    }
}
