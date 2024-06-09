package hardware;

import internet.NavegadorInternet;
import ligacao.AparelhoTelefonico;
import musica.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    public void exibirPagina(String url){
        System.out.println("NAVEGANDO NO IPHONE A URL: "+url);
    }
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NO IPHONE NOVA ABA");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA NO IPHONE");
    }
    public void ligar(String numero){
        System.out.println("LIGANDO DO IPHONE PARA: "+ numero);
    }
    public void atender(){
        System.out.println("ATENDENDO NO IPHONE");
    }
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ NO IPHONE");
    }
    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO NO IPHONE A MUSICA: "+ musica);
    }
    public void pausar(){
        System.out.println("PAUSANDO A MÚSICA NO IPHONE");
    }
    public void tocar(){
        System.out.println("TOCANDO NO IPHONE A MÚSICA");
    }
}
