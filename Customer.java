public  class Customer extends Person {
    private int price=10000;
    public int roomofnum;
    public Customer(int id, String name, int age, int phon,int price,int roomofnum) {
        super(id, name, age, phon);
        this.price=price;
        this.roomofnum=roomofnum;
    }
    @Override
    public double calculatevalue() {
        return roomofnum*price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomofnum() {
        return roomofnum;
    }

    public void setRoomofnum(int roomofnum) {
        this.roomofnum = roomofnum;
    }
}
