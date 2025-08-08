package ch78test;

public class calcTax {
    final private double amount;
    public calcTax()
    {
        amount = 0;
    }
    
    public calcTax(double num)
    {
        amount = num;
    }
    
    public double Taxrate()
    {
        if (amount <= 1000)
        {
            return(amount*1.02);
        }
        if (amount < 5000)
        {
            return(amount*1.03);
        }
        return(amount*1.06);
    }
}
