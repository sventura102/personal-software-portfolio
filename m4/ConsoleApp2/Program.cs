using System;

namespace ConsoleApp2
{
    class Program
    {
        //This program shows me using variables that are used in c#
        private static void Main(string[] args)
        {
            //declaration
            int x;
            char y;
            Boolean z;

            //actualization
            x = 0;
            y = '$';
            z = true;
            
            //print in console
            Console.WriteLine("My money looks like " + y);
            Console.WriteLine("Are you over 18? " + z);
            Console.WriteLine("Your account balance is: " + x);

            Console.Read();
        }
    }
}