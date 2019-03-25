package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends AMazaGenerator {
    @Override
    public Maze generate(int row, int col) {
        Maze grid=new Maze(row,col);
        return grid;
    }
}
