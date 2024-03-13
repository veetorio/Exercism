package exercism01.service;

public class Lasagna {
    private String cozinheiro;
    private int tempo = 40;
    public Lasagna(String __cozinheiro){
        this.cozinheiro = __cozinheiro;
    }

    /**
     * Essa função ela calcula o tempo passado apartir de um parametro
     * @param tempo_passado é o tempo de atual do preparo
     * @return  o retorno é do tipo int e ele visa retorna o tempo de espera
     */
    public int TempoRestante(int tempo_passado){
        final int espera =  this.tempo - tempo_passado;

        return espera;
    }

    /**
    * Essa função retorna apenas o tempo total do preparo
    * @return ele retorna apenas  o tempo de preparo
    * */
    public int TempoDePreparo(){
        return this.tempo;
    }

    /**
     * essa função ela retorna o tempo gasto
     * *levando em consideração que cada passo leva exatos 2 minutos.
     * @param passos é a quantidade de passos para fazer a lasagna
     * @return retorna o tempo gasto;
     */
    public int TempoDeGasto(int passos){
        return passos*2;
    }

    /**
     * essa função retorna o tempo gasto total considerando o tempo gasto em passos e o tempo no forno
     * @param passos são a quantidade de passos para fazer a lasanha
     * @param tempo é o tempo em que a lasagna passa no forno
     * @return é o tempo total para concluir a lasagna
     * */
    public int TempoTotalGasto(int passos,int tempo){
        int tempogasto = TempoDeGasto(passos);
        return tempogasto + tempo;
    }
}
