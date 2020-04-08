public class ReturnValue {
    static String resp= "";

    public  String getMultipleOfNumber(int num){
        if(num > 0 && num<=100){
            if(num%5==0 && num%3==0){
                resp="Multiple of Both";
            }else if(num%3==0){
                resp="A";
            }else if(num%5==0){
                resp="B";
            }
        }
        return resp;
    }
}
