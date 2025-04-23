public class EldrinthDriver {

    public static void main(String[] args) {
        
        Enviroment new_Enviroment = new Enviroment(10, 10, 0);

        new_Enviroment.space.get(1).get(1).setMana(1);

        System.out.println(EnviromentProcesses.SumOfMana(new_Enviroment));

        new_Enviroment.StepTime(2);

        System.out.println(new_Enviroment.toString());

        System.out.println(EnviromentProcesses.SumOfMana(new_Enviroment));
    }
    
}
