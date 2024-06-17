package manager;

import java.util.ArrayList;
import java.util.Scanner;

import model.Customer;
import model.Order;
import model.Product;

public class Managerment {
    public static void menu() {
        System.out.println("1. Add a new product to the Store\r\n" + //
                "2. Update price for a particular product\r\n" + //
                "3. A list of all available products in the Store\r\n" + //
                "4. Create a new Order\r\n" + //
                "5. Print information of an Order by Order ID\r\n" + //
                "6. Sort all products by product price as ascending \r\n" + //
                "7. Print information of all Customer (Name, Sex, Language)\r\n" + //
                "8. Exit\r\n");
    }

    // Static chỉ chơi với static
    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        int choice ;
        ArrayList<Product> listProductInStore = new ArrayList<>();
        ArrayList<Order> listOrder = new ArrayList<>(); 
        do{
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Add a new product to the Store");
                    System.out.println("Enter product name: ");
                    String productName = sc.nextLine();
                    System.out.println("Enter product ID: ");
                    String productId = sc.nextLine();
                    System.out.println("Enter product price: ");
                    double price = Double.parseDouble(sc.nextLine());
                    Product product = new Product(productName, productId, price);
                    listProductInStore.add(product);
                    break;
                case 2: // Interface && String
                    System.out.println("Update price for a particular product");
                    System.out.println("Enter product ID: ");
                    String id = sc.nextLine();
                    for (Product pro : listProductInStore) {
                        if(pro.getProductId().equalsIgnoreCase(id)){
                            System.out.println("Enter new price: ");
                            double newPrice = Double.parseDouble(sc.nextLine());
                            pro.setPrice(newPrice);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("A list of all available products in the Store");
                    for (Product pro : listProductInStore) {
                        System.out.println(pro.toString());
                    }
                    break;
                case 4:
                    System.out.println("Create a new Order");
                    System.out.println("Enter customer name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter customer age: ");
                    String age = sc.nextLine();
                    System.out.println("Enter sex: ");
                    String sex = sc.nextLine();
                    System.out.println("Enter country: ");
                    String country = sc.nextLine();
                    Customer cus = new Customer(name, age, sex, country);
                    System.out.println("Enter order ID: ");
                    String orderId = sc.nextLine();
                    System.out.println("Enter date order: ");
                    String dateOrder = sc.nextLine();
                    ArrayList<Product> list = new ArrayList<>();
                    Order o = new Order(orderId,dateOrder,cus,list);
                    listOrder.add(o);
                    boolean flag = true;
                    do{
                        System.out.println("Enter product ID: ");
                        String idProduct = sc.nextLine();
                        for (Product pro : listProductInStore) {
                            if(pro.getProductId().equalsIgnoreCase(idProduct)){
                                o.addProduct(pro);
                                break;
                            }
                        }
                        System.out.println("Do you want to continue add product to order? (Y/N)");
                        String choiceAdd = sc.nextLine();
                        if(choiceAdd.equalsIgnoreCase("N")){
                            flag = false;
                        }
                    } while(flag);
                    
                    break;
                case 5:
                    System.out.println("Print information of an Order by Order ID");
                    System.out.println("Enter order ID: ");
                    String idOrder = sc.nextLine();
                    for (Order order : listOrder) {
                        if(order.getOrderId().equalsIgnoreCase(idOrder)){
                            System.out.println(order.toString());
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Sort all products by product price as ascending"); // Bubble sort
                    for (int i = 0; i < listProductInStore.size(); i++) {
                        for (int j = i+1; j < listProductInStore.size(); j++) {
                            if(listProductInStore.get(i).compareTo(listProductInStore.get(j))>0){
                                Product temp = listProductInStore.get(i);
                                listProductInStore.set(i, listProductInStore.get(j));
                                listProductInStore.set(j, temp);
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("Print information of all Customer");
                    for (Order order : listOrder) {
                        System.out.println(order.getCusName().toString());
                    }
                    break;
                case 8: 
                    System.out.println("Goodbye");
                    break;

                }
        }while(choice!=8);

    }
}

