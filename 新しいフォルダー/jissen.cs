using System;

namespace BinaryToDecimal
{
    class Program
    {
        static void Main(string[] args)
        {
            string binaryString;
            int decimalNum = 0;

            Console.Write("Enter a binary number: ");
            binaryString = Console.ReadLine();

            // 2進数の各桁の重みを計算して、10進数に変換する
            for (int i = binaryString.Length - 1, j = 0; i >= 0; i--, j++)
            {
                if (binaryString[i] == '1')
                {
                    decimalNum += (int)Math.Pow(2, j);
                }
            }

            Console.WriteLine("The decimal equivalent of " + binaryString + " is " + decimalNum);
            Console.ReadLine();
        }
    }
}