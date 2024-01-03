import java.util.Scanner;

/*****************************************************************************************************************
 * 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
 * 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
 * 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
 * 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
 * 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
 * 	tempo gasto,a distância percorrida e a quantidade de litros utilizada na viagem.
 * 	Dica: trabalhe com valores reais.
 *****************************************************************************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual foi o tempo gasto na viagem?");
        int tg = sc.nextInt();
        System.out.println("Qual foi a velocidade média?");
        int vm = sc.nextInt();
        int distancia = tg * vm;
        int litrosusados = distancia/12;
        System.out.println("O tempo gasto foi: " + tg + "H");
        System.out.println("A velocidade média foi: " + vm + "km");
        System.out.println("A distancia foi: " + distancia + "km");
        System.out.println("Litros usados: " + litrosusados);
    //concluido!!

    }

}