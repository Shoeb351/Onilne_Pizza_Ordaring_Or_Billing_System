package PizaaBill;

public class PizzaDAO {
 private String uname;
 private long cno;
 private double price;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public long getCno() {
        return cno;
    }

    public void setCno(long cno) {
        this.cno = cno;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PizzaDAO{" +
                "uname='" + uname + '\'' +
                ", cno=" + cno +
                ", price=" + price +
                '}';
    }
}
