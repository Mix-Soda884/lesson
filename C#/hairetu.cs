using System;
public class Hello{
    public static void Main(){
        string[] team={"勇者","魔法使い","ドラゴン"};
        Console.WriteLine(team[0]);
        Console.WriteLine(team[1]);
        Console.WriteLine(team[2]);
        Console.WriteLine(team.Length);
    }
}


using System;
public class Hello{
    public static void Main(){
        string[] team={"勇者","魔法使い","ドラゴン"};
        Console.WriteLine(team[0]);
        Console.WriteLine(team[1]);
        Console.WriteLine(team[2]);

        int i;
        for(i=0;i=<3;i++){
        Console.WriteLine(team[i]);
      }
    }
}
