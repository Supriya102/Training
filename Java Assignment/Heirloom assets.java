class Heirloom
{
    int no_of_houses;
    int no_of_vehicles;
    public Heirloom(int no_of_houses,int no_of_vehicles)
    {
        this.no_of_houses=no_of_houses;
        this.no_of_vehicles=no_of_vehicles;
    }
    
    public void display_assets1()
    {
        System.out.println("Assets are :");
        System.out.println("Number of houses owned : " + no_of_houses);
        System.out.println("Number of vehicles owned : " + no_of_vehicles);
    }
}

class Gen_1 extends Heirloom
{
    int no_of_properties;
    public Gen_1(int no_of_houses,int no_of_vehicles,int no_of_properties)
    {
        super(no_of_houses,no_of_vehicles);
        this.no_of_properties=no_of_properties;
    }
    
    public void display_assets2()
    {
        System.out.println("Number of properties owned : " + no_of_properties);
    }
}

class Gen_2 extends Gen_1
{
    
    int no_of_phones;
    public Gen_2(int no_of_houses,int no_of_vehicles,int no_of_properties,int no_of_phones)
    {
        super(no_of_houses,no_of_vehicles,no_of_properties);
        this.no_of_phones=no_of_phones;
    }
    
    public void display_assets3()
    {
        System.out.println("Number of phones owned : " + no_of_phones);
    }
}

class Main{
    public static void main (String[] args) {
        Heirloom obj=new Heirloom(10,15);
        System.out.println("\nHeirloom assets :");
        obj.display_assets1();
        
        Gen_1 obj1=new Gen_1(1,2,20);
        System.out.println("\nGeneration 1 assets :");
        obj1.display_assets1();
        obj1.display_assets2();
        
        Gen_2 obj2 = new Gen_2(1,2,3,12);
        System.out.println("\nGeneration 2 assets :");
        obj2.display_assets1();
        obj2.display_assets2();
        obj2.display_assets3();
}
}
