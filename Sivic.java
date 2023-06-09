public class Sivic extends Car{
    final int baseCost=50000;
    public Sivic(){  // this is not actually needed java does it automatically
        super();
    }
    public int calcTotalCost(){ /// calculates the total cost of a vehicle according to its base price and options
        int totalCost=baseCost;

        if(optionals.get("ABS")){
            totalCost+=absCost;
        }
        if (optionals.get("Sunroof"))
            totalCost+=sunroofCost;
        if (optionals.get("Airbag"))
            totalCost+=airbagCost;
        if (optionals.get("Music System"))
            totalCost+=musicSysCost;

        return totalCost;
    }
    @Override
    public String toString() {
        return "Sivic with " +optionals()+ " having a total price of "+calcTotalCost()+" TL ";
    }
}
