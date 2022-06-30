using System;

class Program
{
    public static void Main()
    {
        int x,y;
        Console.WriteLine("数字を入力してください");
        x = int.Parse(Console.ReadLine());

        y = x%7;

        if(y<=2)
        {
            Console.WriteLine("大吉");
        }
        else if(y<=4)
        {
            Console.WriteLine("吉");
        }
        else
        {
            Console.WriteLine("凶");
        }
    }
}
