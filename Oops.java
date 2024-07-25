// class Car{
//     String colour;
//     String name;

//     public void Runcar(){
//         System.out.println("Car running .....");
//     }

//     public void getcolour(){
// System.out.println(this.colour);
//     }
// }

// public class Oops {
//     public static void main(String args[]){
// Car car1 = new Car();
// car1.colour = "blue";
// car1.name = "Fortuner";
// Car car2 = new Car();
// car2.colour = "red";
// car2.name = "Ferrari";


// car1.Runcar();
// car1.getcolour();
// car2.getcolour();
//     }
// }

//Abstaraction

abstract class Animal {
 abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse walking on 4 legs");
    }
}

public class Oops{

    public static void main(String args[]){
Horse horse = new Horse();
horse.walk();

    }
}