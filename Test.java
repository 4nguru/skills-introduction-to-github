public class While {
       public static void main(String[] args)
       {
          int i = 0;
          System.out.println("While loop");
          while ( i < 5 ) {
              System.out.println(i);
              i++;
          }

          System.out.println("For loop");
          for(i = 5;i>0; i--) System.out.println(i);
       }
}
