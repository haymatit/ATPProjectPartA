package algorithms.mazeGenerators;

public class SimpleMazeGenerator extends AMazaGenerator {
    @Override
    public Maze generate(int row, int col) {
        Maze simple=new Maze(row,col);

        /*
        int startrow,startcol,endrow,endcol;
        startrow= (int)(Math.random()*row);
        startcol= (int)(Math.random()*col);
        endrow= (int)(Math.random()*row);
        endcol=(int)(Math.random()*col);
        while(startrow==endrow && startcol==endcol){
            endrow= (int)(Math.random()*row);
            endcol=(int)(Math.random()*col);
        }
        simple.setStartPosition(startrow,startcol);
        simple.setGoalPosition(endrow,endcol);
        */
        return simple;
    }
}
