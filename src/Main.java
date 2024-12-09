import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        home();
    }

    public static void home(){
        Scanner sc = new Scanner(System.in);
        CesarCipher cc = new CesarCipher();
        String mensagem; int desloc; String text = "";
        System.out.println("\nQual das opções a seguir você deseja:");
        System.out.println("1 - Encriptografar Mensagem");
        System.out.println("2 - Descriptografar mensagem");
        System.out.print("3 - Sair\nR: ");
        int option = sc.nextInt();
        Timer(500);
        switch (option){
            case 1:
                System.out.print("Qual seria a mensagem que você quer encriptografar ?\nMessage: ");
                mensagem = sc.next();
                System.out.println("E o deslocamento ? ");
                desloc = sc.nextInt();
                text = String.valueOf(cc.Encript(mensagem, desloc));
                System.out.println("Encriptando...");
                Timer(1000);
                System.out.println("Mensagem Encriptografada:");
                break;
            case 2:
                System.out.print("Qual seria a mensagem que você quer Descriptografar ?\nMessage: ");
                mensagem = sc.next();
                System.out.println("E o deslocamento ? ");
                desloc = sc.nextInt();
                text = String.valueOf(cc.Decript(mensagem, desloc));
                System.out.println("Descriptando...");
                Timer(1000);
                System.out.println("Mensagem Descriptografada:");
                break;
            case 3:
                tranks();
                Timer(500);
                System.out.println("Power OFF...");
                System.out.close();
                break;
            default:
                System.out.println("Opção não encontrada, tente novamente...");
                Timer(500);
                home();
                break;
        }
        System.out.println(text + "\n");
        tranks();
    }

    public static void tranks(){
        Timer(500);
        System.out.println("Obrigado por utilizar nossos serviços!");
        System.out.println("Até Breve!");
    }

    public static void Timer(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}