public class Electronics extends Product
  {
    private int yearReleased;
    private boolean batteryIncluded;

    public Electronics()
    {
      this(0, "unknown", "unknown", 0, 0, false);
    }

    public Electronics(double p, String c, String n, int q, int y, boolean b)
    {
      super(p, c, n, q);
      this.setYearRel(y);
      this.setBattInc(b);
    }

    public int getYearRel()
    {
      return this.yearReleased;
    }

    public boolean getBattInc()
    {
      return this.batteryIncluded;
    }

    public void setYearRel(int y)
    {
      this.yearReleased = y;
    }

    public void setBattInc(boolean b)
    {
      this.batteryIncluded = b;
    }

    public String toString()
    {
      if(this.batteryIncluded)
      {
        return super.toString() + "\n\t" + this.yearReleased + "\n\tNo battery";
      }
      else
      {
        return super.toString() + "\n\t" + this.yearReleased + "\n\tWith battery";
      }
    }
  }