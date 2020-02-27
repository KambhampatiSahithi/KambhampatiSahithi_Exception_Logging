
public abstract class Interest
{
    public double principal_amount;
    double Cal_Interest(){ return 0.0;}
}
class Simple_Interest extends Interest
{
    double rate,time;
    Simple_Interest(double Rate,double Time,double principal)
    {
        principal_amount = principal;
        rate=Rate;
        time=Time;
    }
    public double Cal_Interest()
    {
        return (principal_amount* rate * time) / 100;
    }
}

class Compound_Interest extends Simple_Interest {
    double compound_periods;
    Compound_Interest(double Rate, double Time, double principal,double compound_per)
    {
        super(Rate, Time, principal);
        compound_periods = compound_per;
    }

    public double Cal_Interest()
    {
        double tmp = (rate) / compound_periods;
        return principal_amount*(Math.pow((1 + tmp),compound_periods*time));
    }
}