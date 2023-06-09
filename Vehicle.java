import java.util.HashMap;

public abstract class Vehicle {
    HashMap<String,Boolean> optionals = new HashMap<>(); // a dictionary type thing for keeping track of optionals
    final int absCost= 5000; // this is here because all vehicles have ABS options
    public abstract int calcTotalCost();

    public String optionals(){ // returns the optionals as a string so we can print it later on
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
