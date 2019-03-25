package algorithms.mazeGenerators;

public class Maze {

    private  int [][] grid;
    private int[] startPosition;
    private int[] goalPosition;
    public Maze(int row, int col) {
        grid=new int[row][col];
        startPosition= new int [2];
        goalPosition= new int [2];
    }

    public Maze(int[][] grid,int[] startPosition,int[] goalPosition){
        this.grid=grid;
        this.goalPosition=goalPosition;
        this.startPosition=startPosition;
    }

    public int[] getStartPosition() {
        return startPosition;
    }

    public int[] getGoalPosition() {
        return goalPosition;
    }

    public void Print(){
        for(int i=0;i<grid.length;i++){
            System.out.println();
            for(int j=0;j<grid[0].length;j++){
                if(startPosition[0]==i && startPosition[1]==j)
                    System.out.print("S");
                else if(goalPosition[0]==i && goalPosition[1]==j)
                    System.out.print("E");
                else
                    System.out.print(grid[i][j]);
            }
        }
    }

    public void setStartPosition(int row, int col) {
        this.startPosition[0] = row;
        this.startPosition[1] = col;
    }

    public void setGoalPosition(int row, int col) {
        this.goalPosition[0] = row;
        this.goalPosition[1] = col;
    }

}
