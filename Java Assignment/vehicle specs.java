class Vehicle
{
    String vehicle_type;
    public Vehicle(String vehicle_type)
    {
        this.vehicle_type=vehicle_type;
    }
    
    public String display_type()
    {
        return ("It is a " + vehicle_type);
    }
}

class Car extends Vehicle
{
    double mileage;
    double power;
    public Car(String vehicle_type,double mileage,double power)
    {
        super(vehicle_type);
        this.mileage=mileage;
        this.power=power;
    }
    
    public void display_car_specs()
    {
        System.out.println(super.display_type()+"\nSpecifications : \nTotal mileage :" + mileage +"km per kg \nMax power :" + power+"bhp");
    }
}

class Bike extends Vehicle
{
    double engine_displacement;
    double torque;
    public Bike(String vehicle_type,double engine_displacement,double torque)
    {
        super(vehicle_type);
        this.engine_displacement=engine_displacement;
        this.torque=torque;
    }
    
    public void display_bike_specs()
    {
        System.out.println("\n"+super.display_type()+"\nSpecifications : \nEngine displacement :" + engine_displacement + "cc\nMax torque :" + torque +"Nm");
    }
}


class Main{
    public static void main (String[] args) {
        Car c1=new Car("Maruti",30.47,58.33);
        c1.display_car_specs();
        Bike b1=new Bike("Harley Davidson",1868,155);
        b1.display_bike_specs();
}
}
