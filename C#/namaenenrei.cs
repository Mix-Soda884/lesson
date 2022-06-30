using System;
class Program
{
    public static void Main()
    {
      string userName = "";
      int userAge = 0;
      int currentYear = 0;
      
      Console.Write("お名前を入力してください ");
      userName = Console.ReadLine();
      Console.Write("年齢を教えてください");
      userAge = Convert.ToInt32(Console.ReadLine());
      Console.Write("今年は西暦何年ですか？");
      currentYear = Convert.ToInt32(Console.ReadLine());
      Console.WriteLine("こんにちは　 {0} さん　あなたは、 {1} 歳で、{2}年生まれなのですね", userName, userAge, currentYear - userAge);
    }
}
