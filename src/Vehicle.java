public class Vehicle {
    String brand;
    int capacity;

    // Konstruktor bez parametowy
    Vehicle(){

    }

    // Konstruktor parametrowy
    Vehicle(String brand){
        this.brand = brand;
        System.out.println("Vehicle constructor");
    }

    public void drive(){
        System.out.println("Jadę!!!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Vehicle)){
            return false;
        }

        return this.brand.equals(((Vehicle)obj).brand) && this.capacity == ((Vehicle)obj).capacity;
    }
}
