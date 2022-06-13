public class Product
  {
    private double price;
    private String company;
    private String name;
    private int quantity;

    public Product()
    {
      this(0, "unknown", "unknown", 0);
    }

    public Product(double p, String c, String n, int q)
    {
      this.setPrice(p);
      this.setCompany(c);
      this.setName(n);
      this.setQuantity(q);
    }

    public double getPrice()
    {
      return this.price;
    }

    public String getCompany()
    {
      return this.company;
    }

    public String getName()
    {
      return this.name;
    }

    public int getQuantity()
    {
      return this.quantity;
    }

    public void setPrice(double p)
    {
      if(p >= 0)
      {
        this.price = p;
      }
    }

    public void setCompany(String c)
    {
      this.company = c;
    }

    public void setName(String n)
    {
      this.name = n;
    }

    public void setQuantity(int q)
    {
      this.quantity = q;
    }

    public String toString()
    {
      return this.name + "\n\t" + this.company + "\n\t" + this.quantity + "\n\t$" + this.price;
    }
  }