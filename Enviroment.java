import java.util.ArrayList;

public class Enviroment{

    ArrayList<ArrayList<Node>> space = new ArrayList<ArrayList<Node>>();
    int max_x;
    int max_y;


    public Enviroment(int x, int y, double init_mana){

        max_x = x;
        max_y = y;
        

        for (int i = 0; i < y; i++){

            ArrayList<Node> node_collum = new ArrayList<Node>();

            for (int u = 0; u < x; u++){

                Node node = new Node(init_mana);
                node_collum.add(node);

            }

            
            space.add(node_collum);

        }

    }

    public void StepTime(){

        space = EnviromentProcesses.DiffuseMana(this).space;

    }

    public void StepTime(int steps){
        for (int i = 0; i < steps; i++){
            this.StepTime();
        }
    }

    @Override
    public String toString() {
        String output = "";

        for (int i = 0; i < space.size(); i++){

            for (int u = 0; u < space.get(i).size(); u++){

                output += space.get(i).get(u).mana;
                output += " ";
            }
            output += "\n";
        }

        return(output);
    }

}