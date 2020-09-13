import java.util.Scanner;
public class Produtos{
  Scanner ler = new Scanner(System.in);
  //int i = 100;
  
  
  String nome[] = new String[100];
  String lote[] = new String[100];
  float venda[] = new float[100];
  float compra[] = new float[100];
  int lista;
  int i = 0;
  int num = -1;

  void quantidade(int quant){
    for(int j = 0; j<=99; j++){
    nome[j] = "Nenhum Produto";
    lote[j] = "Vazio";
    venda[j] = 0;
    compra[j] = 0;
    }
    i = quant - 1;
  }

  void escolha(int opção){

  
    if(opção == 1){
      for(int a=0; a<=i; a++){
        if(nome[a] == "Nenhum Produto"){

          System.out.println("Qual o Nome do "+ (a+1) +"º produto a ser catalogado?");
          nome[a] = ler.nextLine();
          if(a != 0){
          nome[a] = ler.nextLine();
          }
      
          System.out.println("Qual o Lote do "+ (a+1) +"º produto a ser catalogado?");
          lote[a] = ler.nextLine();

          System.out.println("Qual o valor de Compra do "+ (a+1) +"º a ser catalogado?");
          compra[a] = ler.nextFloat();
          System.out.println("Qual o valor Venda do "+ (a+1) +"º produto a ser catalogado?");
          venda[a] = ler.nextFloat();
        }
      }

    }

    if(opção == 2){
      System.out.println("Qual o número do produto, na lista, que deseja remover?");
      lista = ler.nextInt();
      lista -= 1;
      nome[lista] = "Nenhum Produto";
      lote[lista] = "Vazio";
      compra[lista] = 0;
      venda[lista] = 0;
      System.out.println("Produto Removido");
      
    }
    if(opção == 3){
      System.out.println("Qual o número do produto, na lista, que deseja alterar?");
      lista = ler.nextInt();
      lista -= 1;
      System.out.println("Qual o novo Nome do "+ (lista+1) +"º produto a ser catalogado?");
      nome[lista] = ler.nextLine();
      nome[lista] = ler.nextLine();
      
      System.out.println("Qual o novo Lote do "+ (lista+1) +"º produto a ser catalogado?");
      lote[lista] = ler.nextLine();

      System.out.println("Qual o novo valor de Compra do "+ (lista+1) +"º a ser catalogado?");
      compra[lista] = ler.nextFloat();
      System.out.println("Qual o novo valor Venda do "+ (lista+1) +"º produto a ser catalogado?");
      venda[lista] = ler.nextFloat();


    }
    if(opção == 4){
      for(int l = 0; l<= i; l++){
        System.out.print((l+1)+"º Produto\nProduto: "+nome[l]+"\nLote: "+lote[l]+"\nValor da compra: "+compra[l]+"\nValor de venda: "+venda[l]+"\n");
      }
    }

    if(opção == 5){
      System.out.println("Qual o novo tamanho da lista?");
      i = ler.nextInt();
      i-=1;
    }

    if(opção == 6){
      System.out.print("Sistema finalizado");
    }

  }




}