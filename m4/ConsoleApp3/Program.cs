using System;

namespace ConsoleApp3
{

    class Program
    {
        private static void Main(string[] args)
        {
            // Condition practice
            //ex (condition) ? x : y

            double temperature = 20;
            String message;

            //if (temperature >= 15)
            //{
            //    message = "It's warm outside!";
            //}
            //else
            //{
            //    message = "It's cold outside!";
            //}
            

            message = (temperature >= 15) ? "It's warm outside" : "It's cold outside";
            Console.WriteLine(message);
            Console.ReadLine();
        }
    }
}