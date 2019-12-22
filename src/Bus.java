public class Bus extends Vehicle {
    int iloscMiejsc;

    Bus(){
        System.out.println("Bus construtor");
    }

    @Override
    public String toString() {
        return super.toString() + " Bus{iloscMiejsc= " + this.iloscMiejsc + "}";
    }
}
