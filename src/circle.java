public class circle extends shape{
    private double radius;

    public circle(String color, double radius) {
        super(color);
        this.radius=radius;
    }

    @Override
    public double getdientich() {
        return radius*radius*3.14;
    }

    @Override
    public double getchuvi() {
        return radius*3.14*2;
    }

    @Override
    public void showof() {
        System.out.println("Cicle: ");
        System.out.println("radius: "+ radius);
        System.out.println("mau: "+ color);
        System.out.println("chu vi: "+ getchuvi());
        System.out.println("dien tich: "+ getdientich());
    }
}
