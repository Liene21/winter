import org.testng.annotations.Test;

public class ObjectsPractice {
        @Test
    public void workingWithOrders() {
            Order firstOrder = new Order();
            firstOrder.setTotalPrice(12.34);
            firstOrder.setAdress("Rigas str.22");
            firstOrder.setItemCount(8);

            Order secondOrder = new Order();
            secondOrder.setTotalPrice(122.34000);
            secondOrder.setAdress("Maskavas str. 13-3");
            secondOrder.setItemCount(3);

            System.out.println("Hello, world");
            System.out.println("1st order:");
            System.out.println(firstOrder.getTotalPrice());

            System.out.println("2ed order:");
            System.out.println(secondOrder.getTotalPrice());
        }

}
