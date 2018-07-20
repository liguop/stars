public class wan{
    public static void main(String[]args){
        stars(5);
    }
	
    static void stars(int row){
        int column=row*2-1;    //column是多少列（星星+空格的个数）
        for(int i=1,space=row-1;i<=column*row;i++){
            if(space>0){   //需要打空格的时候打空格
                System.out.print(" ");
                space--;
            }else if(i%9>(i/column)+row){   //控制星星右面的空格
                System.out.print(" ");
            }else if(i==column*row){     // 最后一个需要打星星
                System.out.print("*");
            }else if(i%column==0){      // 每行的最后一次打一个空格加一个换行
                space=5-(i/column)-1;
                System.out.print(" ");
                System.out.println();
            }else{
                System.out.print("*");
            }
        }
    }
}