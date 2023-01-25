public class Fruit
{
  public static void main(String[] args) {

		Customer customer1, customer2;

		Order order1, order2;

		customer1 = new Customer();

		customer1.setName("Rex Rosales");

		customer2 = new Customer();

		customer2.setName("Elijah Custodio");

		order1 = new Order();

		order1.setOrder("Watermelon");

		order1.setCustomerName(customer1);

		order2 = new Order();

		order2.setOrder("Banana");

		order2.setCustomerName(customer2);

		System.out.println(order1.toString());

		System.out.println(order2.toString());

	}	
}
