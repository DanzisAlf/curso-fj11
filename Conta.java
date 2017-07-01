class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String abertura;
    
    void saca(double valor){
        this.saldo-=valor;
    }
    
    void deposita(double valor){
        this.saldo+=valor;
    }
    
    double calculaRendimento(){
    return this.saldo * 0.1;
    }
    
    String recuperaDadosParaImpressao(){
      String dados = "Titular: "+this.titular;
      dados += "\nNumero: " + this.numero;
      dados +="\nAgencia: " + this.agencia;
      dados +="\nSaldo: " + this.saldo;
      dados +="\nAbertura: "+ this.abertura;
      dados +="\nRendimento: "+this.calculaRendimento();
      return dados;
    }
}
