package ligacao;

public class Discador implements AparelhoTelefonico{
    public void ligar(String numero){
        System.out.println("LIGANDO");
    }
    public void atender(){
        System.out.println("ATENDENDO");
    }
    public void iniciarCorreioVoz(){
        System.out.println();
    }
}
