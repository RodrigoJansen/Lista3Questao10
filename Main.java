import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int quant, contador, opção, num = -1;
    boolean desligar = false;
    System.out.println("Hello world!");
    Scanner ler = new Scanner(System.in);
    Produtos Produto = new Produtos();
    System.out.println("Quantos produtos terão em seu mercado? (O Máximo é 100)");
    quant = ler.nextInt();
    Produto.quantidade(quant);

    while(desligar == false){
      System.out.println("Qual o número da opção que você escolhe?\n1.Cadastrar\n2.Remover\n3.Atualizar\n4.Listar\n5.Alterar tamanho da lista\n6.Parar Programa");
      opção = ler.nextInt();
      Produto.escolha(opção);
      if(opção == 6){
        desligar = true;
      }
    }
  }
}