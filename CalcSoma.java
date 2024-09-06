public class CalcSoma {
    public static void main(String [] args){
        int INDICE = 12, SOMA = 0, K = 1;

       for(; K < INDICE; K++){
            K = K + 1;
            SOMA = SOMA  + K;
        }
       System.out.println(SOMA);
    }
}
