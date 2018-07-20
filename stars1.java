public class starts1{
    public static void main(String[]args){
        stars(6);
    }
    static void stars(int r){
        int row=1,xx=0; //row是打印多少行， xx是控制是否打星星
    bb:
        for(int lie=1,kong=r;lie<=r*2-1;lie++){
            if(kong-lie>0||xx>=row*2-1){
                System.out.print(" ");
            }else{
                System.out.print("*"); 
                xx++; 
            }
            if(row<r&&lie==r*2-1){
                System.out.println();
                kong--;row++;
                xx=0;lie=0;
                continue bb;
            }
        }
    }
}