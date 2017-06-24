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
}
