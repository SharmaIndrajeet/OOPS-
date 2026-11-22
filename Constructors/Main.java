class Car {
    String model; 
    int MaxSpeed; 

    void running(){
        System.out.println("Car is running");
    }

    // constructor 
    Car (String model, int MaxSpeed){
        this.model = model; 
        this.MaxSpeed = MaxSpeed; 
    }
}


public class Main {

    public static void main(String[] args) {

        Car maruti = new Car("Jeep" , 300); 
        System.out.println(maruti.MaxSpeed);

        Car BMW = new Car("Offroad", 450); 
        System.out.println(BMW.MaxSpeed);

       
    }
    
}
