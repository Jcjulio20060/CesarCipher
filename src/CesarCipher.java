public class CesarCipher {
    private final String alfabeto = "abcdefghijklmnopqrstuvwxyz";

    public StringBuilder Encript(String message, int desloc){
        String[] alfa = alfabeto.split("");
        String[] mensagem = message.split("");

        StringBuilder text = new StringBuilder(" ");

        for(int i = 0; i < mensagem.length; i++){
            for(int j = 0; j < alfa.length; j++){
                if(mensagem[i].equals(alfa[j])){
                    if(Verifica(j, desloc) == 1){
                        text.append(alfa[j + desloc]);
                    } else {
                        int number = (j + desloc) - alfa.length;
                        text.append(alfa[number]);
                    }
                }
            }
        }

        return text;
    }

    public StringBuilder Decript(String message, int desloc){
        String[] alfa = alfabeto.split("");
        String[] mensagem = message.split("");

        StringBuilder text = new StringBuilder(" ");

        for(int i = 0; i < mensagem.length; i++){
            for(int j = 0; j < alfa.length; j++){
                if(mensagem[i].equals(alfa[j])){
                    if(VerificaContra(j, desloc) == 1){
                        text.append(alfa[j - desloc]);
                    } else {
                        int number = alfa.length + (j - desloc);
                        text.append(alfa[number]);
                    }
                }
            }
        }

        return text;
    }

    public int Verifica(int i, int desloc){
        String[] alfa = alfabeto.split("");
        if((i + desloc) < alfa.length){
            return 1;
        } else {
            return 0;
        }
    }

    public int VerificaContra(int i, int desloc){
        if((i - desloc) >= 0){
            return 1;
        } else {
            return 0;
        }
    }
}
