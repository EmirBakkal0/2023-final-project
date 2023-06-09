import java.util.ArrayList;

public class Inventory {
    ArrayList <Vehicle> inventory=new ArrayList<>();

    public void add(Vehicle vehicle){
        inventory.add(vehicle);
    }

    private int totalValueOfVehicles(){
        int total=0;
        for (Vehicle vehicle: inventory) {
            total += vehicle.calcTotalCost();
        }
        return total;
    }


    private int carCount(){
        int count=0;
        for (Vehicle vehicle: inventory) {
            if (vehicle.getClass().getSuperclass().getName().equals("Car")  ){

                count++;
            }

        }
        return count;
    }

    private int bikeCount(){
        int count =0;
        for (Vehicle vehicle: inventory) {

            if (vehicle.getClass().getSuperclass().getName().equals("Motorbike")){
                count++;
            }

        }
        return count;
    }




    @Override
    public String toString() {
        String toReturn ="";
        for (Vehicle vehicle : inventory) {
            toReturn+= vehicle.toString() +  "\n";
        }
        toReturn+= "TOTAL : "+inventory.size()+" Vehicles including "+ carCount()+ " Cars and "+bikeCount()+" Motorbikes having a total price of "+totalValueOfVehicles()+" TL";

        return toReturn;
    }
}
