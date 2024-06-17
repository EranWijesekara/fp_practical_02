object run{
   def easyPaceTime(km:Double):Double=8*km
   def normalPaceTime(km:Double):Double=7*km

   def main(args: Array[String]):Unit={
        printf("Total time = %.2f minutes",easyPaceTime(2)+normalPaceTime(3)+easyPaceTime(2))
   }

    
}
