public class Policy
{
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;

   private static int policyCount = 0;

   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyHolder = new PolicyHolder();
      policyCount++;
   }

   public Policy(int policyNumber, String providerName,
                 String firstName, String lastName,
                 int age, String smokingStatus,
                 double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;

      this.policyHolder = new PolicyHolder(firstName, lastName, age,
                                            smokingStatus, height, weight);

      policyCount++;
   }

   public PolicyHolder getPolicyHolder()
   {
      return policyHolder;
   }

   public static int getPolicyCount()
   {
      return policyCount;
   }

   public double calculatePrice()
   {
      double price = 600.0;

      if (policyHolder.getAge() > 50)
         price += 75;

      if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += 100;

      double bmi = policyHolder.getBMI();

      if (bmi > 35)
         price += (bmi - 35) * 20;

      return price;
   }

   public String toString()
   {
      return "Policy Number: " + policyNumber +
             "\nProvider Name: " + providerName +
             "\n" + policyHolder.toString() +
             "\nPolicy Price: $" + String.format("%.2f", calculatePrice());
   }
}            