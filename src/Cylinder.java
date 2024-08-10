public class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder (double radius, double height){
        try {
            if (radius < 0) {
                throw new IllegalArgumentException("Cylinder radius must be greater than or equal to zero");
            }
            this.radius = radius;
        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            }

        try {
            if (height < 0) {
                throw new IllegalArgumentException("Cylinder height must be greater than or equal to zero");
            }this.height = height;
        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }}

    @Override
    double surface_area(){
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString(){
        String str = "";
        str = "Cylinder surface area:  " +  String.format("%.2f square inches",surface_area()) +
        "\nCylinder volume:        " + String.format("%.2f cubic inches",volume());
        return str;
    }
}
