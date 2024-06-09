package aparelho;

import hardware.Iphone;
import internet.NavegadorInternet;
import ligacao.AparelhoTelefonico;
import musica.ReprodutorMusical;

public class IphoneEmmanuel {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        NavegadorInternet nvi = iphone;
        nvi.exibirPagina("http://www.google.com");

        AparelhoTelefonico atf = iphone;
        atf.ligar("8787454958");

        ReprodutorMusical rmu = iphone;
        rmu.selecionarMusica("Unforgiven");
    }
}
