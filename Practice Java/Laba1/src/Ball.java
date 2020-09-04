public class Ball {
    private String producer;
    private int price;
    public Ball(String c, int price){
        producer = c;
        this.price = price;
    }
    public Ball(String c){
        producer = c;
        price = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Ball(){
        producer = "Alpha";
        price = 100;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return "Ball made by " + this.producer + " and it's price is "+this.price + "$";
    }
    public void ballInfo(){
        System.out.println("Ball made by " + this.producer + " and it's price is " + this.price * 75 + " rub");
    }
}