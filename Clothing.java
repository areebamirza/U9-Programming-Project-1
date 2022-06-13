public class Clothing extends Product
  {
    private String brand;
    private int size;

    public Clothing()
    {
      this(0, "unknown", "unknown", 0, "unknown", 0);
    }

    public Clothing(double p, String c, String n, int q, String b, int s)
    {
      super(p, c, n, q);
      this.setBrand(b);
      this.setSize(s);
    }

    public String getBrand()
    {
      return this.brand;
    }

    public int getSize()
    {
      return this.size;
    }

    public void setBrand(String b)
    {
      this.brand = b;
    }

    public void setSize(int s)
    {
      this.size = s;
    }

    public String toString()
    {
      return super.toString() + "\n\t" + this.brand + "\n\t" + this.size;
    }
  }