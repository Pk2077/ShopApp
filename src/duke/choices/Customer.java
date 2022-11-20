package duke.choices;

public class Customer {
   private String size;
    private String name;
    private Clothing[] items;

    public void addItems(Clothing[] someItems){
        items=someItems;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurment){
        switch (measurment){
            case 1,2,3 ->
                setSize("S");
            case 4,5,6 ->
                setSize("M");
            case 7,8,9 ->
                setSize("L");
            default ->
                setSize("XL");

        }
    }

    public Customer (String name, int measurment){
        this.name=name;
        setSize(measurment);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clothing[] getItems() {
        return items;
    }

    public void setItems(Clothing[] items) {
        this.items = items;
    }
    public double getTotalCost(){
        double total=0;
        for (Clothing item : items){
            total=total+item.getPrice();
        }
        return total;
    }
}
