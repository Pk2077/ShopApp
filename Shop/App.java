package Shop;

public class App {
    public static void main(String[] args) {
        double tax=0.2;
        double total=0;

        Clothing item1 = new Clothing( "Blue Jacket",20.9,"M");
        Clothing item2 = new Clothing("Orange T-Shirt",10.5,"S");
        Clothing item3 = new Clothing("Green Scarf",5.5,"S");
        Clothing item4 = new Clothing("Hat",10,"S");

        Clothing[] items= {item1,item2,item3,item4};

        Customer c1 = new Customer("Pinky",3);

        System.out.println(items.length);

        c1.addItems(items);

        System.out.println("Customer c1 :"+","+c1.getName()+","+c1.getSize()+","+c1.getTotalCost());

        for (Clothing item: c1.getItems()){
            System.out.println("items are :"+item.getDescription()+","+item.getSize()+","+item.getPrice());

        }

        int average=0;
        int count=0;
        for (Clothing item : c1.getItems()){
            if(item.getSize().equals("L")){
                count++;
                average+=item.getPrice();
            }
        }

        try {
            average = average / count;
            System.out.println(average);
        }catch (ArithmeticException e){
                System.out.println("Don't Divide by Zero");
            }
        }

    }
