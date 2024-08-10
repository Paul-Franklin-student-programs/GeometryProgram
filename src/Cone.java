public class Cone extends Shape{
    private double radius;
    private double height;
    public Cone (double radius, double height){
        try {
            if (radius < 0) {
                throw new IllegalArgumentException("Cone radius must be greater than or equal to zero");
            }
            this.radius = radius;
        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        try {
            if (height < 0) {
                throw new IllegalArgumentException("Cone height must be greater than or equal to zero");
            }
            this.height = height;
        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }}


    @Override
    double surface_area(){
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString(){
        String str = "";
        str = "Cone surface area:      " +  String.format("%.2f square inches",surface_area()) +
                "\nCone volume:            " + String.format("%.2f cubic inches",volume());
        return str;
    }
}