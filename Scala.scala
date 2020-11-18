import java.util.Scanner;
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    var k=6
    for(i <- 1 to 9 by 2)
    {
       for(j <- i+k to i+k-2 by -1)
       {
           printf("I=%d J=%d\n",i,j)
       }
    }

}
}
 
