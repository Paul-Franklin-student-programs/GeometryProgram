public class Sphere extends Shape {
    private double radius;


    public Sphere (double radius){
        try {
            if (radius < 0) {
                throw new IllegalArgumentException("Sphere radius must be greater than or equal to zero");
            }
            this.radius = radius;
        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }}




    @Override
    double surface_area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString(){
        String str = "";
        str = "Sphere surface area:    " +  String.format("%.2f square inches",surface_area()) +
        "\nSphere volume:          " + String.format("%.2f cubic inches",volume());
        return str;
    }
}
