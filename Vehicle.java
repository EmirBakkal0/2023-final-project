import java.util.HashMap;

public abstract class Vehicle {
    HashMap<String,Boolean> optionals = new HashMap<>();
    final int absCost= 5000;
    public abstract int calcTotalCost();
    public String optionals(){
        StringBuilder toReturn= new StringBuilder();
        for (String i: optionals.keySet()){
            if(optionals.get(i)){  // if the option value is true
                toReturn.append(i).append(", ");
            }
        }
        toReturn.delete(toReturn.lastIndexOf(","),toReturn.capacity()); // to get rid of last comma
        return toReturn.toString();
    }
 }
