package com.LeetCodeRecursion;

public class BackTrackingfalse {
    public static void main(String[] args) {
        boolean maze[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        mazeBackTracking("",maze,0,0);

    }
    public static void mazeBackTracking(String path,boolean maze[][],int row,int column){
        if(row== maze.length-1 && column==maze[0].length-1){
            System.out.println(path);
            return;
        }
        //if there are Barrier in the MAZE
         if(maze[row][column]==false){
             return;
         }
         maze[row][column]=false;  //this means we are setting false for every visited cage

        if(row< maze.length-1){
            mazeBackTracking(path+"Down",maze,row+1,column);

        }
        if(column<maze[0].length-1){
            mazeBackTracking(path+"Right",maze,row,column+1);
        }
        if(row>0){
            mazeBackTracking(path+"Up", maze, row-1, column);  //This line is error of
        }
        if(column>0){
            mazeBackTracking(path+"Left", maze, row, column-1);
        }
        //this the line where the return or emptying of Stack takes
        //Hence whatever change is made is not visible for next Recursion call
        maze[row][column]=true;  //BACKTRACKING
    }
}
