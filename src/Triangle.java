public class Triangle extends shape{
    private double height;
    private double base;

    public Triangle(String color, double height, double base) {
        super(color);
        this.base=base;
        this.height=height;
    }

    @Override
    public double getdientich() {
        return height * base;
    }

    @Override
    public double getchuvi() {
        return (height+base)/2;
    }

    @Override
    public void showof() {
        System.out.println("Triangle: ");
        System.out.println("chieu cao: "+ height);
        System.out.println("day: "+ base);
        System.out.println("mau: "+ color);
        System.out.println("chu vi: "+ getchuvi());
        System.out.println("dien tich: "+ getdientich());
    }
}
