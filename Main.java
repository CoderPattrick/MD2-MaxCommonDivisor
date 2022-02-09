public class Main {
    public static void main(String[] args) {
        int result = calCommonDivísor(24,18);
        System.out.println(result);
    }
    public static int calCommonDivísor(int a,int b){
        while(a!=b){
            if(a<b){
                b=b-a;
            }
            else{
                a=a-b;
            }
        }
        return a;
    }
}
