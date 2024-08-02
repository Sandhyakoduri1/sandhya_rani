public class GCDOfString {
    public String gcdOfString(String str1, String str2){

        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int str1Length = str1.length();
        int str2Length = str2.length();

        int gcdStrLength;
       if(str1Length > str2Length){
           gcdStrLength=gcd(str1Length,str2Length);
       }else {
           gcdStrLength=gcd(str2Length,str1Length);
       }

        return str1.substring(0,gcdStrLength);

    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

