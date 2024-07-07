public class HealthRecord{

//Private fields 
private double weight;
private double height;
private double minWeight;
private double maxWeight;
private double minHeight;
private double maxHeight;

//Static constants for max and min values
private static final double MAX_WEIGHT = 200.0;//in kilograms
private static final double MIN_WEIGHT = 2.0;//in kilograms
static final double MAX_HEIGHT = 3.0;//in meters
private static final double MIN_HEIGHT = 0.4;//in meters

//Constructor
public HealthRecord(double weight, double height){
    setWeight(weight);
    setHeight(height);

}

//Getter for weight
public double getWeight(){
    return weight;
}

// Setter for weight with validation
public void setWeight(double weight){
    if(weight >= MIN_WEIGHT && weight <=  MAX_WEIGHT){
        this.weight = weight;
    }else{
        throw new IllegalArgumentException("Weight must be between"+ MIN_WEIGHT + " and " + MAX_WEIGHT + " kilograms. ");
    }
}

//Getter for height
public double getHeight(){
    return height;
}

// Setter for height with validation
public void setHeight(double height){
    if(height >= MIN_HEIGHT && height <=  MAX_HEIGHT){
        this.height = height;
    }else{
        throw new IllegalArgumentException("Height must be between"+ MIN_HEIGHT + " and " + MAX_HEIGHT + " meters. ");
    }
}

// Getter for minWeight
public double getMinWeight() {
    return minWeight;
}

// Setter for minWeight (if needed)
public void setMinWeight(double minWeight) {
    this.minWeight = minWeight;
}

// Getter for maxWeight
public double getMaxWeight() {
    return maxWeight;
}

// Setter for maxWeight (if needed)
public void setMaxWeight(double maxWeight) {
    this.maxWeight = maxWeight;
}

// Getter for minHeight
public double getMinHeight() {
    return minHeight;
}

// Setter for minHeight (if needed)
public void setMinHeight(double minHeight) {
    this.minHeight = minHeight;
}

// Getter for maxHeight
public double getMaxHeight() {
    return maxHeight;
}

// Setter for maxHeight (if needed)
public void setMaxHeight(double maxHeight) {
    this.maxHeight = maxHeight;
}

}