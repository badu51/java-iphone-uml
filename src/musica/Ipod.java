package musica;

public class Ipod implements ReprodutorMusical{
    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MUSICA");
    }
    public void pausar(){
        System.out.println("PAUSANDO A MÚSICA");
    }
    public void tocar(){
        System.out.println("TOCANDO A MÚSICA");
    }
}
