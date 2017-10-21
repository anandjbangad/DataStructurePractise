package exponential;

public class RecursionCalculateExponentialValue {

//    static int num =10;
//    static int desiredPower =3;
//    static int passingNum =1;
//    int n=0;
//    public static void main(String[] args) {
//        System.out.print(call());
//    }
//    public static int call(){
//        int value = expoential(1,0);
//        return value;
//    }
//
//    public static int expoential(int passingNum, int power){
//        if(power > desiredPower){
//            return passingNum;
//        }
//        else {
//            passingNum = num * passingNum;
//            expoential(passingNum, power+1);
//        }
//        return passingNum;
//    }
public static void main(String[] args) {
    System.out.print(exponential(2,3));
}
public static int exponential(int num,int pow){
    if(pow ==0)
        return 1;
    if(pow == 1)
        return num;
    else{
        return num * exponential(num,pow-1);
    }
}
}
