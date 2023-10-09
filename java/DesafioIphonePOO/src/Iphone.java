// Classe Iphone que implementa as interfaces
class Iphone implements Navegador, AparelhoTelefonico, ReprodutorMusical {
  @Override
  public void exibirPagina(String url) {
    System.out.println("Exibindo página: " + url);
  }

  @Override
  public void adicionarNovaAba(String url) {
    System.out.println("Adicionando nova aba: " + url);
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página");
  }

  @Override
  public void ligar(double numero) {
    System.out.println("Ligando para o número: " + numero);
  }

  @Override
  public void atender() {
    System.out.println("Atendendo chamada");
  }

  @Override
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

  @Override
  public void tocar(String musica) {
    System.out.println("Tocando música: " + musica);
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música");
  }

  @Override
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando música: " + musica);
  }
}