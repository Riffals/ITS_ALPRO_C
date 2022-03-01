import java.util.Random;

class ComputeMethods5026211189  {
    
    //task 1
    public double fToC(double degreesF) {
        double degreesC = 5.0/9.0*(degreesF-32.0);
        return degreesC;
    }

    //task 2
    public double hypotenuse(int a, int b)  {
        return Math.sqrt(Math.pow(a,2.0) + Math.pow(b, 2.0));
    }

    //task 3
    public int roll()   {
        Random rand = new Random();
        return rand.nextInt(6) + 1 + rand.nextInt (6) + 1;
    }
}
