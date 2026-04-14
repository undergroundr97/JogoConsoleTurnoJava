package inventory;
public class Inventory {
    private double gold;
    public double goldAvailable(){
        return this.gold;
    }
    public Inventory(double gold){
        this.gold = gold;
    }
    public Inventory(){

    }

    public void addGoldToInventory(double gold){
        this.gold += gold;
    }
    public void removeGoldFromInventory(double gold){
        this.gold -= gold;
    }
}
