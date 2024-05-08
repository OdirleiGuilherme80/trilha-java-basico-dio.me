public class User {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("A televisão tá ligada? " + smartTv.ligada);
        System.out.println("Qual canal apareceu? " + smartTv.canal);
        System.out.println("QUal volume á a TV? " + smartTv.volume);

        
        smartTv.ligar(); //método ligar criado na class SmartTv com o status ligar
        System.out.println("Novo status --> TV ligada agora? " + smartTv.ligada);

        smartTv.desligar();//método ligar criado na class SmartTv com o status desligar
        System.out.println("Novo status --> TV ligada agora? " + smartTv.ligada);
        

        smartTv.avancarCanal(); //método avaçar e retorceder canal criado na class SmartTv
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.retrocederCanal();
        smartTv.retrocederCanal();

        System.out.println("novo status de canal --> Qual canal atual? " + smartTv.canal);

        /*forma de chamar segundo método e parametro para troca de canal:
        smartTv.mudarCanal(13);
        System.out.println("status de canal -->Canal atual? " + smartTv.canal);

         */

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        smartTv.aumentarvolume();
        

        System.out.println("novo status de volume --> Qual volume da tv agora? " + smartTv.volume);
    }
    
}
