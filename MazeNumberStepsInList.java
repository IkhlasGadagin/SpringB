import java.util.ArrayList;
import java.util.Arrays;

public class MazeNumberStepsInList {
    public static void main(String[] args) {
        boolean maze[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int arr[][]=new int[maze.length][maze[0].length];

        System.out.println(steps("",maze,0,0,1,arr));;

    }
    public static ArrayList<String> steps(String path,boolean maze[][],int row, int column,int steps,int arr[][]){
        //base condition
        if(row== maze.length-1 && column==maze[0].length-1){
             ArrayList<String> list=new ArrayList<>();
            for (int[] hanif:arr) {
                System.out.println(Arrays.toString(hanif));

            }
            list.add(path);
            System.out.println();
           
            return list;
        }
        if(maze[row][column]==false){
            ArrayList<String> list=new ArrayList<>();
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        maze[row][column]=false;
        arr[row][column]=steps;
        if(row<maze.length-1){
            list.addAll(steps(path+"Down",maze,row+1,column,steps+1,arr));
        }
        if(column<maze.length-1){
            list.addAll(steps(path+"right",maze,row,column+1,steps+1,arr));
        }
        if(row>0){
            list.addAll(steps(path+"Up",maze,row-1,column,steps+1,arr));
        }
        if(column>0){
            list.addAll(steps(path+"Left",maze,row,column-1,steps+1,arr));
        }
        //backTracking for the true setting back
        maze[row][column]=true;
        arr[row][column]=0;  //While emptying the stack backTracing to the 0 to the each case
        return list;

    }
}
