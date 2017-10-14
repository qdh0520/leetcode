package practice;

/**
 * Created by Administrator on 2017/7/10.
 */
public class PrintMatixClockwisely {

    public static void main(String[] args) {
        int[][] array={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       PrintMatixClockwisely testCircle=new PrintMatixClockwisely();
        testCircle.printMatix(array);
    }
    public void printMatix(int[][] array){//顺时针打印矩阵
        if(array==null){
            return;
        }
        int start=0;
        //左上角的第一个坐标：（0，0）
        //array[0] 代表列数
        while(array[0].length>start*2&&array.length>start*2){
            printOneCircle(array,start);
            start++;
        }
    }
    //在圆圈中打印矩阵，打印一圈分4种情况:一步，二步，三步，四步 :
    private void printOneCircle(int[][] array, int start) {
        // 从左到右打印一行  :
        for(int i=start;i<array[0].length-start;i++){
            System.out.print(array[start][i]+" ");
        }
        //从上到下打印一列  :
        if(array.length-1-start>start){
            for(int i=start+1;i<array.length-start-1;i++){
                System.out.print(array[i][array[0].length-1-start]+" ");
            }
        }
        // 从右到左打印一行 :
        if(array[0].length-start-1>start &&array.length-start-1>start){
            for(int i=array.length-start-1;i>start;i--){
                System.out.print(array[array.length-start-1][i]+" ");
            }
        }
        // 从下到上打印一行 :
        if(array.length-1-start>start &&array[0].length-1-start>start){
            for(int i=array.length-start-1;i>start;i--){
                System.out.print(array[i][start]+" ");
            }
        }
    }
}
