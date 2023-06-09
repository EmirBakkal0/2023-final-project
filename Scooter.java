public class Scooter extends Motorbike {
    int baseCost=20000;
    @Override
    public String toString() {
        return "Scooter with "+optionals()+ " having a total price of "+calcTotalCost()+" TL ";
    }

    public int calcTotalCost(){
        int totalCost=baseCost; /// calculates the total cost of a vehicle according to its base price and options

        if(optionals.get("ABS")){
            totalCost+=absCost;
        }
        if (optionals.get("Seat Heating"))
            totalCost+=seatHeatingCost;

        return totalCost;
    }
}
