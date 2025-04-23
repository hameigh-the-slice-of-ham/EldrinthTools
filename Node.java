import java.util.ArrayList;

public class Node {

    double mana;

    ArrayList<Element> elements = new ArrayList<Element>();
    ArrayList<Spell> spells = new ArrayList<Spell>();

    public Node(double init_mana){

        mana = init_mana;

    }

    public void setMana(double new_mana){
        mana = new_mana;
    }

    
    

}
