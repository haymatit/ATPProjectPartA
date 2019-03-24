package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends IMazeGenerator {
    @Override
    public Maze generate(int row, int col) {
        return Maze(row,col);
    }
}
