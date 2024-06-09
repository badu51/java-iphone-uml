package internet;

public class Safari implements NavegadorInternet{
    public void exibirPagina(String url){
        System.out.println("NAVEGANDO NA URL: "+url);
    }
    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }
    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PÁGINA");
    }
}
