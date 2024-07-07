public class Main{
public static void main(String[] args) {
    // Create an instance of HealthRecord
    HealthRecord patient1 = new HealthRecord(80, 1.80);
    HealthRecord patient2 = new HealthRecord(65, 1.70);

    System.out.println(patient1.getHeight());
    System.out.println(HealthRecord.MAX_HEIGHT);
    

    //Example of using getter methods
     System.out.println("Patient 1's weight: " + patient1.getWeight() + " kilograms");
     System.out.println("Patient 1's height: " + patient1.getHeight() + " meters");
     System.out.println("Patient 2's weight: " + patient2.getWeight() + " kilograms");
     System.out.println("Patient 2's height: " + patient2.getHeight() + " meters");
     

     //Example of using setter methods
    try {
        patient1.setWeight(65.0);
        patient1.setHeight(1.8);
        patient2.setWeight(60.0);
        patient2.setHeight(1.70);
         System.out.println("\nUpdated Patient 1's weight: " + patient1.getWeight() + " kilograms");
        System.out.println("Updated Patient 1's height: " + patient1.getHeight() + " meters");
         System.out.println("\nUpdated Patient 2's weight: " + patient2.getWeight() + " kilograms");
         System.out.println("Updated Patient 2's height: " + patient2.getHeight() + " meters");
     } catch (IllegalArgumentException e) {
         System.out.println("Exception while updating health record: " + e.getMessage());
     }

     //Example of validation
     try {
     //Invalid weight
         patient1.setWeight(350.0); // This will throw an exception
        patient2.setWeight(250.0); // This will throw an exception
     } catch (IllegalArgumentException e) {
         System.out.println("\nException occurred: " + e.getMessage());
     }
}


}


