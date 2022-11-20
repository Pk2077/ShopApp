package duke.choices;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0;

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5.5, "S");
        Clothing item4 = new Clothing("Hat", 10, "S");

        Clothing[] items = {item1, item2, item3, item4};

        Customer c1 = new Customer("Pinky", 3);

        System.out.println(items.length);

        c1.addItems(items);
        
        try{
        ItemList list = new ItemList(items);
        Routing routing = Routing.builder()
                .get("/items",list).build();
        ServerConfiguration config= ServerConfiguration.builder()
        .bindAddress(InetAddress.getLocalHost())
                .port(9050).build();
        WebServer ws=WebServer.create(config,routing);
        ws.start();
        }catch (UnknownHostException ex){
        }
        

        System.out.println("Customer c1 :" + "," + c1.getName() + "," + c1.getSize() + "," + c1.getTotalCost());
        for (Clothing item : c1.getItems()) {
            System.out.println("items are :" + item);

        }
        int average = 0;
        int count = 0;
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }

        try {
            average = average / count;
            System.out.println(average);
        } catch (ArithmeticException e) {
            System.out.println("Don't Divide by Zero");
        }
        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()) {
            System.out.println("items are :" + item);

        }
        System.out.println(c1.toString());
    }
}
