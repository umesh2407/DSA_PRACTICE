class Car{
    String colour;
    String name;

    public void Runcar(){
        System.out.println("Car running .....");
    }

    public void getcolour(){
System.out.println(this.colour);
    }
}

public class Oops {
    public static void main(String args[]){
Car car1 = new Car();
car1.colour = "blue";
car1.name = "Fortuner";
Car car2 = new Car();
car2.colour = "red";
car2.name = "Ferrari";


car1.Runcar();
car1.getcolour();
car2.getcolour();
    }
}
