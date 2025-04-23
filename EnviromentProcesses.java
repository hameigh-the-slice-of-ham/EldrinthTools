import java.util.ArrayList;

public class EnviromentProcesses {

    public void StepTime(){

    }

    public void DiffuseDiffuseables(){

    }

    public static Enviroment DiffuseMana(Enviroment enviroment){

        Enviroment new_enviroment = new Enviroment(enviroment.max_x, enviroment.max_y, 0);

        for (int i = 0; i < enviroment.space.size(); i++){
            for (int u = 0; u < enviroment.space.get(i).size(); u++){
                new_enviroment.space.get(i).get(u).mana = enviroment.space.get(i).get(u).mana;
            }
        }
        

        for (int i = 0; i < enviroment.space.size() ; i++){

            for (int u = 0; u < enviroment.space.get(i).size(); u++){

                double current_node_mana = enviroment.space.get(i).get(u).mana;
                double average_adjecent_mana = EnviromentProcesses.GetAdjecentMana(enviroment, i, u);

                if (current_node_mana > average_adjecent_mana){

                    new_enviroment.space.get(i).get(u).setMana(average_adjecent_mana);
                    try {
                        new_enviroment.space.get(i+1).get(u).setMana((enviroment.space.get(i+1).get(u).mana)+((current_node_mana - average_adjecent_mana)/4));

                    } catch (Exception e) {}
                    try {
                        new_enviroment.space.get(i-1).get(u).setMana((enviroment.space.get(i+1).get(u).mana)+((current_node_mana - average_adjecent_mana)/4));

                    } catch (Exception e) {}
                    try {
                        new_enviroment.space.get(i).get(u+1).setMana((enviroment.space.get(i+1).get(u).mana)+((current_node_mana - average_adjecent_mana)/4));

                    } catch (Exception e) {}
                    try {
                        new_enviroment.space.get(i).get(u-1).setMana((enviroment.space.get(i+1).get(u).mana)+((current_node_mana - average_adjecent_mana)/4));
                    } catch (Exception e) {}

                    

                }




            }
        }

        return(new_enviroment);
        
    }

    public static double GetAdjecentMana(Enviroment enviroment, int node_x, int node_y){
        double average_adjecent_mana = 0;

        int adjecent_nodes = 4;

        try {
            average_adjecent_mana += enviroment.space.get(node_y+1).get(node_x).mana;
        } catch (Exception e) {
            adjecent_nodes -= 1;
            
        }
        try {
            average_adjecent_mana += enviroment.space.get(node_y-1).get(node_x).mana;
        } catch (Exception e) {
            adjecent_nodes -= 1;
            
        }
        try {
            average_adjecent_mana += enviroment.space.get(node_y).get(node_x+1).mana;
        } catch (Exception e) {
            adjecent_nodes -= 1;
            
        }
        try {
            average_adjecent_mana += enviroment.space.get(node_y).get(node_x-1).mana;
        } catch (Exception e) {
            adjecent_nodes -= 1;
            
        }

        average_adjecent_mana /= adjecent_nodes;
        return average_adjecent_mana;
    }

    public static double SumOfMana(Enviroment enviroment){

        double sum = 0;

        for (int i = 0; i < enviroment.space.size() ; i++){

            for (int u = 0; u < enviroment.space.get(i).size(); u++){

                sum += enviroment.space.get(i).get(u).mana;
        
            }
        }

        return (sum);
    }

    public void UpdateSpellStates(){

    }

    public void CastActiveSpells(){

    }
    
}
