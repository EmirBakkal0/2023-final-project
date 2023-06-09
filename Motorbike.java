public abstract class Motorbike extends Vehicle{
    final int seatHeatingCost=2000;// setting the prices of options

    public Motorbike(){
        optionals.put("ABS",false); // setting all options as false first
        optionals.put("Seat Heating",false);

    }
    public void setAbs(boolean bool){
        optionals.replace("ABS",bool);
    }
    public void setSeatHeating(boolean bool){
        optionals.replace("Seat Heating",bool);
    }



}
