public class Women extends Clothing
  {
    private String type;

    public Women()
    {
      this(0, "unknown", "unknown", 0, "unknown", 0, "unknown");
    }

    public Women(double p, String c, String n, int q, String b, int s, String t)
    {
      super(p, c, n, q, b, s);
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