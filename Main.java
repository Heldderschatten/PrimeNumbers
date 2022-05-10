/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int numberOfPrimeNumbers = 10;
        int[] lists = new int[numberOfPrimeNumbers]; 
        lists[0] = 2;
        boolean isPrime = true;
        int x = 1;
        for(int i = 0; i<lists.length;i += 0){
            isPrime = true;
            //System.out.println("Ich habe soviele primzahlen gefunden: " + i );
            x++;
                for(int d = 0; d < i;d++ ){
                    if(x%lists[d] == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    lists[i+1] = x;
                    i++;
                    System.out.println(x);
                }

            
        }
    }
}