public class Racer extends Motorbike {

    int baseCost=60000;

    public int calcTotalCost(){ /// calculates the total cost of a vehicle according to its base price and options
        int totalCost=baseCost;

        if(optionals.get("ABS")){
            totalCost+=absCost;
        }
        if (optionals.get("Seat Heating"))
            totalCost+=seatHeatingCost;

        return totalCost;
    }

    public String toString() {
        return "Racer with "+optionals()+ " having a total price of "+calcTotalCost()+" TL ";
    }
}
