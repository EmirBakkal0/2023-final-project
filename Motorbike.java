public abstract class Motorbike extends Vehicle{
    final int seatHeatingCost=2000;


    public Motorbike(){
        optionals.put("ABS",false);
        optionals.put("Seat Heating",false);

    }
    public void setAbs(boolean bool){
        optionals.replace("ABS",bool);
    }
    public void setSeatHeating(boolean bool){
        optionals.replace("Seat Heating",bool);
    }



}
