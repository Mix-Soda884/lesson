using System;

class Program
{
    public static void Main()
    {
      　int x,v;
      　Console.WriteLine("打ち上げたい回数を書いてください");
        v = int.Parse(Console.ReadLine());
        for(x=1;x<=v;x=x+1)
        {
            Console.WriteLine("" +x+　"　回花火が上がった　");
        }
    }
}
