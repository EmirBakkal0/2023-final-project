public class Sivic extends Car{
    final int baseCost=50000;
    public Sivic(){
        super();


    }
    public int calcTotalCost(){
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
