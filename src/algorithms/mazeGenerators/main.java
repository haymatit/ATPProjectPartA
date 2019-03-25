package algorithms.mazeGenerators;

public class main {
    public static void main(String[] args) {
        SimpleMazeGenerator s= new SimpleMazeGenerator();
        Maze m=s.generate(2,5);
        m.Print();
    }
}
