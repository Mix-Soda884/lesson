using System;
using System.Collections.Generic;
class Program
{
    public static void Main()
    {
        List <string> fruits=new List <string>();
        string fruit;
        Console.WriteLine("好きな果物を入れてください");
        fruit=Console.ReadLine();
        fruits.Add(fruit);
        while (true)
        {
            if(Console.ReadLine.() == "99")
            {
                break;
            }
            fruits.Add(Console.ReadLine());
        }
        
        Console.WriteLine(fruits.Count);
        foreach (string x in fruit)
        {
            Console.WriteLine(x);
        }
        Console.ReadLine();
    }
}
