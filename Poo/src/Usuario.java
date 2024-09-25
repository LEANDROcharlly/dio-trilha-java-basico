public class Usuario {
    public static void main(String[] args) {
        
        ReprodutorMusical itunes = new ReprodutorMusical();
        
        itunes.tocar();
        itunes.play();
        itunes.pausar();
        itunes.selecionarMusica("another love");

        AparelhoTelefonico contatos = new AparelhoTelefonico();

        contatos.play();

        NavegadorInternet safari = new NavegadorInternet();

        safari.play();

        
        
    }
}
