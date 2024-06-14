public class BreakContinue {
    
    public static void main( String [] args ) {

               for( int i = 0 ; i < 10 ; i++ ) {

                     if( i % 2 == 0)//não imprime os números pares
                     { 
                        continue; 
                     }

                     System.out.println("The number is " + i );

                     if( i == 7 ) //para o loop caso i seja 7
                     {
                          break;
                      }

               }
        }

}
