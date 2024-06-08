using System;

namespace ConsoleApp4
{
    class Program
    {
        private static void Main(string[] args)
        {
            // while loop = repeat code while some condition remains true
            Console.Write("Enter your name: ");
            String name = Console.ReadLine();

            while (name == "")
            {
                //statement is repeated until something is written on the line
                Console.Write("Enter your name: ");
                name = Console.ReadLine();
            }
            // prints name with hello at the beginning
            Console.Write("Hello " + name);
            Console.ReadKey();
        }
    }
}