package VisitorPattern;

public class Car {
    private String brand, model,year;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void price(String setPrice){
        System.out.println("Fiyatı: " + setPrice);
    }

    public void accpet(ICarVisitor visitor){
        visitor.visit(this);
    }



}
