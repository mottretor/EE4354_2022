package week02.snl;

public class Square {
    private int position;
    private String type;

    public void landsOn(Player player, Square[] squares,int diceValue){
        player.setPosition(position);
        System.out.println(player.getName()+" is landed on "+position);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
