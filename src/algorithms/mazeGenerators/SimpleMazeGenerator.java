package algorithms.mazeGenerators;

public class SimpleMazeGenerator extends AMazaGenerator {

    @Override
    public Maze generate(int row, int col) {
        int [][]grid=new int[row][col];
        int[] startPosition={0,0};
        int[] goalPosition=new int[2];
        /*building walls*/
        for(int i=0;i<grid.length;i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j]=(int) (Math.random()*2);
            }
        }
        /*make a way*/
        boolean end=false;
        int i=0,j=0,stepper=0;
        while(end==false && i<row && j<col){
            grid[i][j]=0;
            stepper=(int) (Math.random()*2);
            if(stepper==0)
                i++;
            else
                j++;
        }
        if(i>=row)
            i--;
        else
            j--;
        goalPosition[0]=i;
        goalPosition[1]=j;
        Maze simple=new Maze(grid,startPosition,goalPosition);
        return simple;
    }
}
