package BridgePattern;

public class Rectangle extends Shape {
    public Rectangle(Color color){
        super(color);
    }
    @Override
    public void draw(){
        System.out.println("Dikdörtgen Çiziliyor");

    }
}
