package VisitorPattern;

public class SanroofVisitor implements ICarVisitor{
    @Override
    public void visit(Car car) {
        System.out.println(car.getBrand() + " sanroof açıldı");
    }
}
