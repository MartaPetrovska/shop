import java.util.ArrayList;

public class Shop {

  // Shop functionality
  // AddItemToCart -> done
  // Get the items list -> done
  // RemoveItemFromCart -> future
  // Checkout (get the totalPrice)
  private ArrayList<Item> items = new ArrayList<Item>();
  private ArrayList<Item> cart = new ArrayList<Item>();

  public ArrayList<Item> getItems() {
    return items;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(int id) {
    for (var item : items) {
      if (item.getId() == id) {
        items.remove(item);
        return;
      }
    }
  }

  public void updateItem(int id, String name, int cost) {
    for (var item : items) {
      if (item.getId() == id) {
        item.setName(name);
        item.setCost(cost);
        return;
      }
    }
  }

  public void addItemToCart(Item item) {
    // items list, it would contain the amount of available items
    // Before we add item to the cart, we would check whether or not it is available
    cart.add(item);
  }

  public int checkout() { // get the total cost
    int sum = 0;
    for (var item : cart) {
      sum += item.getCost();
    }
    return sum;
  }

  public void showItemList() {
    System.out.println("Item list:");
          for(var item : items){
              System.out.println("Name: " + item.getName() + ", cost: " + item.getCost() + ", ID: " + item.getId());
          }
  }

}
