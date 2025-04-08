import java.util.ArrayList;

public class Node {

    int mana;
    int temp;

    ArrayList<Element> elements = new ArrayList<Element>();
    ArrayList<Spell> spells = new ArrayList<Spell>();

    public Node(int init_temp, int init_mana){

        mana = init_mana;
        temp = init_temp;

    }
    

}
