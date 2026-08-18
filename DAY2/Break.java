package Day2;

public class Break {
    public static void main(String [] args){
        int i=0;
        for(i=0;i<=10;i++){
            if (i==5){
                continue;
            }
            if(i==8){
                break;
            }
            System.out.println(i);
        }
    }
}
