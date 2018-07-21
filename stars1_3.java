public class stars1_3{
    public static void main(String[]args){
           stars(5);
    }
    static void stars(int row){
        StringBuilder sb=new StringBuilder("");   // 不需要线程安全
        //row是打印多少行，space是最多有几个空格，column是最多有多少列
        int column=row*2-1,space=row-1; 
        for(int i=0;i<space+column+row;i++){
            if(i<space){                 // 一开始先拼接空格
                sb.append(" ");
            }else if(i<space+column){
                sb.append("*");          // 再拼接 *
            }else if(i<space+column+row){      //对拼接好的字符串进行截取
                System.out.println(sb.substring(i-space-column,(i-space-column)*2+row));
            }
        }
    }
}