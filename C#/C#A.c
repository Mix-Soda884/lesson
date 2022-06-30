using System;

namespace InputTest
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("こんにちは");

            // 1. Console.ReadLine()で、文字列を入力してもらう。
            // 2. Console.Write()で、入力してもらった文字列を出力（改行なし）
            Console.Write(Console.ReadLine());
            // 次の文字列を出力
            Console.Write("さんはじめまして");
        }
    }
}
