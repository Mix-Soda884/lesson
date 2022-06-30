using System;

class Program
{
    public static void Main ()
    {
       double height;
       double weight;
       double bmi;

       Console.WriteLine("あなたの身長を教えてください");
       height = double.Parse(Console.ReadLine());
       height /= 100;

       Console.WriteLine("あなたの体重を教えてください");
       weight = double.Parse(Console.ReadLine());

       bmi = weight / Math.Pow(height,2);

       if(bmi >=25)
       {
          Console.WriteLine("太り気味です(" + bmi + ")");
       }
       else if (bmi >= 18.5)
       {
          Console.WriteLine("普通です(" + bmi + ")");
       }
       else
       {
          Console.WriteLine("瘦せ気味です(" + bmi + ")");
       }
    }
}
