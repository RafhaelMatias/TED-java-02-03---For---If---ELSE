import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sexo, qtfem=0, qtmasc=0;
        float altura, somaHomens=0, mediahomens =0, maiorAltura=0, menorAltura=100;

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Digite o SEXO da pessoa, sendo\n0 para FEMININO ou 1 para MASCULINO: ");
            sexo = entrada.nextInt();
            System.out.print("Qual a altura: ");
            altura = entrada.nextFloat();
            if (sexo == 0) {
                System.out.print("Você escolheu: Sexo Feminino, com ALTURA de " + altura + "m\n");
                qtfem++;
            } else if (sexo == 1) {
                System.out.print("Você escolheu: Sexo Masculino, com ALTURA de " + altura + "m\n");
                qtmasc++;
                somaHomens = somaHomens + altura;
            } else {
                System.out.println("A Opção Escolhida foi Inválida!");
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }
            if (altura < menorAltura){
                menorAltura = altura;
            }
        }
        mediahomens = somaHomens / qtmasc;

        System.out.println("\nA maior altura foi de " + maiorAltura + "m, e a menor foi de " + menorAltura + "m");
        System.out.println("Média de altura (sexo Masculino): " + mediahomens + "m");
        System.out.println("Pessoas do sexo Feminino : " + qtfem + " mulheres.");

        entrada.close();

    }
}