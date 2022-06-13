public class Media extends Product
  {
    private String type;

    public Media()
    {
      this(0, "unknown", "unknown", 0, "unknown");
    }

    public Media(double p, String c, String n, int q, String t)
    {
      super(p, c, n, q);
      this.setType(t);
    }

    public String getType()
    {
      return this.type;
    }

    public void setType(String t)
    {
      this.type = t;
    }

    public String toString()
    {
      return super.toString() + "\n\t" + this.type;
    }
  }