package week02.snl;

public class Ladder extends Square{
    int endingPosition;

    public Ladder(int position, String type, int endingPosition){
        setPosition(position);
        setType(type);
        setEndingPosition(endingPosition);
    }

    @Override
    public void landsOn(Player player, Square[] squares,int diceValue) {
        player.setPosition(endingPosition);
        System.out.println(player.getName()+" is landed on "+getPosition()+" with a "+getType()+ "moving to the new position "+endingPosition);
        squares[endingPosition-1].landsOn(player, squares, diceValue);

    }

    public int getEndingPosition() {
        return endingPosition;
    }

    public void setEndingPosition(int endingPosition) {
        this.endingPosition = endingPosition;
    } 
}
