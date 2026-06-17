import java.util.*;
import java.io.*;

public class Project_Adham_Abedalkader {
     public static void main(String[] args) throws IOException {

   ArrayList<Policy> policies = new ArrayList<Policy>();

   File file = new File("PolicyInformation.txt");

   Scanner inputFile = new Scanner(file);

   while (inputFile.hasNextLine()) {

      int policyNumber = Integer.parseInt(inputFile.nextLine());

      String providerName = inputFile.nextLine();

      String firstName = inputFile.nextLine();

      String lastName = inputFile.nextLine();

      int age = Integer.parseInt(inputFile.nextLine());

      String smokingStatus = inputFile.nextLine();

      double height = Double.parseDouble(inputFile.nextLine());

      double weight = Double.parseDouble(inputFile.nextLine());

      Policy policy = new Policy(

         policyNumber,

         providerName,

         firstName,

         lastName,

         age,

         smokingStatus,

         height,

         weight);

      policies.add(policy);
      
      if (inputFile.hasNextLine()) {
          inputFile.nextLine();
   }
}
   inputFile.close();

   int smokers = 0;

   int nonSmokers = 0;

   for (Policy policy : policies) {

      System.out.println("Policy Number: " + policy.getPolicyNumber());

      System.out.println("Provider Name: " + policy.getProviderName());

      System.out.println("Policyholder's First Name: " + policy.getFirstName());

      System.out.println("Policyholder's Last Name: " + policy.getLastName());

      System.out.println("Policyholder's Age: " + policy.getAge());

      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());

      System.out.printf("Policyholder's Height: %.1f inches%n",

                        policy.getHeight());

      System.out.printf("Policyholder's Weight: %.1f pounds%n",

                        policy.getWeight());

      System.out.printf("Policyholder's BMI: %.2f%n",

                        policy.calculateBMI());

      System.out.printf("Policy Price: $%.2f%n%n",

                        policy.calculatePrice());

      if (policy.getSmokingStatus().equalsIgnoreCase("smoker")) {

         smokers++;

      }

      else {

         nonSmokers++;

      }

   }

   System.out.println("The number of policies with a smoker is: " + smokers);

   System.out.println("The number of policies with a non-smoker is: " + nonSmokers);
 }
 
}