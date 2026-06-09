class Item{
    String name;
    double price;
    
    Item(String name,double price){
        this.name=name;
        this.price=price;
    }
}
class order{
    Item item1;
    Item item2;
    
order(Item item1,Item item2){
        this.item1=item1;
        this.item2=item2;
    }
    
    void printBill(){
        double totalCost = item1.price + item2.price;
        System.out.println("Total Cost: $"+ totalCost);
    
    }
}
public class Main {
    public static void main(String[] args){
        Item mouse = new Item("Mouse",20.0);
        Item keyboard= new Item("Keyboard",45.0);
        order order = new order(mouse, keyboard);
        order.printBill();
    
}
}
