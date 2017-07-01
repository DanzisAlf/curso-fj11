class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura; //valor referencia da memoria do tipo Data
    
    public void saca(double valor){
      this.saldo-=valor;
    }
    
    public void deposita(double valor){
      this.saldo+=valor;
    }
    
    public double calculaRendimento(){
      return this.saldo * 0.1;
    }
    
    
    //exe5.8 atributos privados metodos publicos
    public String setTitular(String titular){
      return this.titular = titular;
    }
    
    /*criando variavel para armazenar dados. +=concatena string */
    String recuperaDadosParaImpressao(){
      String dados = "Titular: "+this.titular;
      dados += "\nNumero: " + this.numero;
      dados +="\nAgencia: " + this.agencia;
      dados +="\nSaldo: " + this.saldo;
      dados +="\nAbertura: "+ this.dataAbertura;
      dados +="\nRendimento: "+this.calculaRendimento();
      return dados;
    }
}
