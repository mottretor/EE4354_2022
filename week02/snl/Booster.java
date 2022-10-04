package week02.snl;

public class Booster extends Square{

    public Booster(int position, String type, int endingPosition){
        setPosition(position);
        setType(type);
    }

    @Override
    public void landsOn(Player player, Square[] squares,int diceValue) {
        player.setPosition(getPosition()+1);
        System.out.println(player.getName()+" is landed on "+getPosition()+" with a "+getType()+ "moving to the new position "+String.valueOf(getPosition()+1));
        squares[getPosition()].landsOn(player, squares, diceValue);

    }

}
