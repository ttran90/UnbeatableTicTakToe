import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thanh on 1/3/17.
 */
public class Player {
    private String name;
    private List<String> moves;

    public Player(String name){
        this.name = name;
        this.moves = new ArrayList<String>();
    }

    public String getName(){
        return this.name;
    }

    public List<String> getMoves(){
        return this.moves;
    }

    public void addMove(String move){
        moves.add(move);
    }

}
