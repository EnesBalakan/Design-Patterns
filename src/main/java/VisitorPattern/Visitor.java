package VisitorPattern;

public class Visitor {
    public static void main(String[] args) {
        HyundaiTucson hyundai = new HyundaiTucson();
        hyundai.price("1.900.000");

        RenaultMegane renault = new RenaultMegane();
        renault.price("950.000");

        ICarVisitor sanroof = new SanroofVisitor();
        hyundai.accpet(sanroof);
    }
}
