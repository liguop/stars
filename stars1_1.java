public class stars1_1{
    public static void main(String[]args){
        stars(6);
    }
    static void stars(int r){
        int row=1,xx=0; //row是打印多少行， xx是控制是否打星星
    bb:
        // column是多少列（星星+空格的个数），space是控制空格的数量
        for(int column=1,space=r;column<=r*2-1;column++){
            if(space-column>0||xx>=row*2-1){
                System.out.print(" ");
            }else{
                System.out.print("*"); 
                xx++; 
            }
            // 打印完一列后，continue 到标签，继续重新打印
            if(row<r&&column==r*2-1){
                System.out.println();
                space--;row++;
                //xx和column需要重新计数
                xx=0;column=0;
                continue bb;
            }
        }
    }
}