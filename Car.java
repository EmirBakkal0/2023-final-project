public abstract class Car extends Vehicle{
    final int airbagCost=3000;
    final int musicSysCost=1000;  // setting the prices of options
    final int sunroofCost=2000;


    public Car(){
        optionals.put("ABS",false);
        optionals.put("Airbag",false);
        optionals.put("Music System",false);  // setting all options as false first
        optionals.put("Sunroof",false);
    }


    public void setMusicSystem(boolean bool){
        optionals.replace("Music System",bool);

    }
    public void setSunRoof(boolean bool){
        optionals.replace("Sunroof",bool);
    }

    public void setAirBag(boolean bool){
        optionals.replace("Airbag",bool);

    }
    public void setAbs(boolean bool){
        optionals.replace("ABS",bool);
    }





}
