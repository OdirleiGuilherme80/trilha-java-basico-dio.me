public class SmartTV {
    boolean ligada = false;
    int canal = 56;
    int volume = 9;

    public void ligar(){
        ligada=true;
    }

    public void desligar(){
        ligada = false;
    }

    public void avancarCanal(){
        canal++;
        System.out.println("Troquei para o canal: " + canal);
    }

    public void retrocederCanal(){
        canal--;
        System.out.println("Troquei para o canal: " + canal);
    }
     
    /* Segunda forma de realizar troca de canal da tv!!
    
    public void aumentarCanal (int novoCanal){
        canal = novoCanal;
    }
    
    */

    public void aumentarvolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

}
    