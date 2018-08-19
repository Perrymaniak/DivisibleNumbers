public class ForStatement {

//    public static double calculateInterest(double amount, double interestRate){
//        return (amount * (interestRate/100));
//    }
//
//    public static boolean isPrime(int n){
//
//        if(n==1){
//            return false;
//        }
//
//        for(int i=2; i<= n/2; i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args){
//        int counter = 0;
////        for(int i=8; i>=2; i--){
////            System.out.println(String.format("%.0f",calculateInterest(10000.0,(double)i)));
////        }
//        for(int i=1; i<=100; i++){
//
//            if(isPrime(i)){
//                System.out.println(counter+" prime number is: " + i);
//                counter++;
//            }if(counter==3){
//                break;
//            }
//        }
//
//    }

    public static void divided(){
        int sum = 0;
        int counter = 0;
        for(int i = 1; i <= 1000; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("Found number " + i);
                sum += i;
                counter++;
            }if(counter==5){
                break;
            }
        }
        System.out.println("\nSum of numbers: " + sum);
    }

    public static void main(String[] args){
        divided();
    }

}
