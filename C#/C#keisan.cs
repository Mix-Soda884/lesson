using System;

class Program
{
    public static void Main()
    {
        double x,y,ans;
        double wari;
        double amari;
        Console.WriteLine("数字を記入してください");
        x = double.Parse(Console.ReadLine());
        y = double.Parse(Console.ReadLine());

        ans = x * y;
        wari = x/y;
        amari = x%y;

        Console.WriteLine(""+ ans + "");
        Console.WriteLine(""+ wari +"");
        Console.WriteLine(""+ amari +"");

    }
}
