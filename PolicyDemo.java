public class PolicyDemo
{
   public static void main(String[] args)
   {
      int smokerCount = 0;
      int nonSmokerCount = 0;

      Policy p1 = new Policy(3450, "State Farm", "Alice", "Jones", 20, "smoker", 65, 110);
      Policy p2 = new Policy(3455, "Aetna", "Bob", "Lee", 54, "non-smoker", 72, 200);
      Policy p3 = new Policy(2450, "Met Life", "Chester", "Williams", 40, "smoker", 71, 300);
      Policy p4 = new Policy(3670, "Global", "Cindy", "Smith", 55, "non-smoker", 62, 140);
      Policy p5 = new Policy(1490, "Reliable", "Jenna", "Lewis", 30, "smoker", 60, 105);
      Policy p6 = new Policy(3477, "State Farm", "Craig", "Duncan", 23, "smoker", 66, 215);

      Policy[] policies = {p1, p2, p3, p4, p5, p6};

      for (Policy p : policies)
      {
         System.out.println(p);
         System.out.println();

         if (p.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
            smokerCount++;
         else
            nonSmokerCount++;
      }

      System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}