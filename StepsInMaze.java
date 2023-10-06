package com.LeetCodeRecursion;

import java.util.Arrays;

//To print all the possible count  Ways in the Maze int 2D array
public class StepsInMaze {
    public static void main(String[] args) {
        boolean maze[][]={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int arr[][]=new int[maze.length][maze[0].length];
        steps("",maze,0,0,1,arr);

    }
    public static void steps(String path,boolean maze[][],int row,int column,int steps,int arr[][]){
        if(row== maze.length-1 && column==maze[0].length-1){
            arr[row][column]=steps;
            for (int[] ikhlas:arr) {

                System.out.println(Arrays.toString(ikhlas));
            }
            System.out.println(path);
            System.out.println();
            return;
        }
        //if there are Barrier in the MAZE
        if(maze[row][column]==false){
            return;
        }
        maze[row][column]=false;  //this means we are setting false for every visited cage

        arr[row][column]=steps;

        if(row< maze.length-1){
            steps(path+"Down",maze,row+1,column,steps+1,arr);

        }
        if(column<maze[0].length-1){
            steps(path+"Right",maze,row,column+1,steps+1,arr);
        }
        if(row>0){
            steps(path+"Up", maze, row-1, column,steps+1,arr);  //This line is error of
        }
        if(column>0){
            steps(path+"Left", maze, row, column-1,steps+1,arr);
        }
        //this the line where the return or emptying of Stack takes
        //Hence whatever change is made is not visible for next Recursion call
        maze[row][column]=true;  //BACKTRACKING
        arr[row][column]=0;
    }
}
