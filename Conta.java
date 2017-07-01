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
    public void setTitular(String titular){
      this.titular = titular;
    }
    
    public String getTitular(){
      return this.titular;
    }
    
    public void setNumero(int numero){
      this.numero=numero;
    }
    
    public int getNumero(){
      return this.numero;
    }
    
    public String getAgencia(){
      return this.agencia;
    } 
    
    public void setAgencia(String agencia){
      this.agencia = agencia;
    }
    
    public String getDataAbertura (){
      return this.dataAbertura;
    }
    
    public void setDataAbertura(String dataAbertura){
      this.dataAbertura = dataAbertura;
    }
  
    
    /*criando variavel para armazenar dados. +=concatena string */
    public String recuperaDadosParaImpressao(){
      String dados = "Titular: "+this.titular;
      dados += "\nNumero: " + this.numero;
      dados +="\nAgencia: " + this.agencia;
      dados +="\nSaldo: " + this.saldo;
      dados +="\nAbertura: "+ this.dataAbertura;
      dados +="\nRendimento: "+this.calculaRendimento();
      return dados;
    }
}
