public class Scooter extends Motorbike {
    int baseCost=20000;
    @Override
    public String toString() {
        return "Scooter with "+optionals()+ " having a total price of "+calcTotalCost()+" TL ";
    }

    public int calcTotalCost(){
        int totalCost=baseCost;

        if(optionals.get("ABS")){
            totalCost+=absCost;
        }
        if (optionals.get("Seat Heating"))
            totalCost+=seatHeatingCost;

        return totalCost;
    }
}
