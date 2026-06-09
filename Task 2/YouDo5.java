class Printer{
    void printData(String text){
        System.out.println("Text: "+text);
    }
    void printData(int number){
        System.out.println("Number: "+number);
    }
}
public class Main1{
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printData("Hello, World!");
        p.printData(100);
    }
}
