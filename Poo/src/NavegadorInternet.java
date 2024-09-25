public class NavegadorInternet implements Iphone {

    @Override
    public void play() {
        this.atualizarPagina();
    }

    public void exibirPagina(String url){
        System.out.println("Exibindo a pagina " + url);
    }

    public void adicionarNovaAba(){
        System.out.println("Aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }

}
