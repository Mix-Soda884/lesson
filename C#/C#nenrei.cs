using System;

class Program
{
    public static void Main ()
    {
        float umare;
        float nenrei;

        Console.WriteLine("生まれた年を記入してください");
        umare = float.Parse(Console.ReadLine());

        nenrei = 2022-umare;

        Console.WriteLine("あなたは " + nenrei + "歳ですね");
    }
}
