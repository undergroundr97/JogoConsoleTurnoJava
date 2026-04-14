package inventory;
public class Inventory {
    private static double gold;

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
