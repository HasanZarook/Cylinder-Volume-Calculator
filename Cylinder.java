
class circle1{
   // public double r;
    public double area(double r1){
       // this.r=r;
        return (3.14*r1*r1);
    }

}




public class Cylinder {
    public circle1 c;
    public double height;
    public double r;

    public Cylinder(double r,double height){
        this.height = height;
        this.r=r;
       c = new circle1();
    }

    public double Volume(){

        return (c.area(r) * height);
    }

    public static void main(String[] args) {
        Cylinder a =new Cylinder(3,5);
        System.out.println(a.Volume());
    }
}
