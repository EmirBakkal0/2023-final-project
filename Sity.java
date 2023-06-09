public class Sity extends Car{
    int baseCost=40000;
    public int calcTotalCost(){
        int totalCost=baseCost; /// calculates the total cost of a vehicle according to its base price and options

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
        return "Sity with "+optionals()+ " having a total price of "+calcTotalCost()+" TL ";
    }


}
