import java.util.Scanner;

public class Main {

  public static Shop shop = new Shop();
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to our shop! Please select access type: ");
    System.out.println("1 - admin;");
    System.out.println("2 - customer;");
    
    var accessType = scanner.nextLine();

    while (true)
    if(accessType.equals("1")){
      System.out.println("Which actions you want to do?");
      System.out.println("1 - add item;");
      System.out.println("2 - update item;");
      System.out.println("3 - remove item;");
      System.out.println("4 - exit;");
      
      var adminAction = scanner.nextLine();

      if(adminAction.equals("1")){
          System.out.println("Items name: "); 
          var name = scanner.nextLine();
          System.out.println("Items ID: "); 
          int id = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Items cost: "); 
          int cost = scanner.nextInt();
          scanner.nextLine();
          var item = new Item (id);
          item.setName(name);
          item.setCost(cost);
          shop.addItem(item);
          shop.showItemList();
      } else if (adminAction.equals("2")) {
          System.out.println("Items ID: "); 
          int id = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Updated name: "); 
          var name = scanner.nextLine();
          System.out.println("Updated cost: "); 
          int cost = scanner.nextInt();
          scanner.nextLine();
          shop.updateItem(id, name, cost);
          System.out.println("Item with ID " + id + "is updated.");
          shop.showItemList();
      } else if (adminAction.equals("3")) {
          System.out.println("Items ID: ");
          int id = scanner.nextInt();
          scanner.nextLine();
          shop.removeItem(id);
          shop.showItemList();
      } else if (adminAction.equals("4")) {
          System.out.println("Thank you for using our shop! See you next time!");
          break;
      }

      
    }

  }

}
