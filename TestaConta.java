class TestaConta{
    public static void main(String[] args){
        Conta c1= new Conta();
        
        c1.setTitular("Daniel");
        c1.setNumero(123);
        c1.setAgencia("45678-9");
        c1.deposita(50.0);
        c1.setDataAbertura("09/06/2015");
               
        c1.deposita(100);
        
        
        System.out.println("metodo Titular: "+c1.getTitular());
        System.out.println("metodo Numero: "+c1.getNumero());   
        System.out.println("identificador c1: "+c1.getIdentificador());     
        System.out.println(c1.recuperaDadosParaImpressao());
        
        /* 
        A instrucao acima ja soma o novo saldo e rendimento
        System.out.println("Saldo atual: " + c1.saldo);
        System.out.println("Rendimento Mensal: " + c1.calculaRendimento());
        */
        
        /*parte 4 criando duas contas. referenciam objetos diferentes da classe,
        porem comparando atributis*/
        
        Conta c2 = new Conta("Dan", 123, "89-0");
        c2.deposita(50.0);
        c2.setDataAbertura("09/06/2015");
        System.out.println("metodo Titular: "+c2.getTitular());
        System.out.println("metodo Numero: "+c2.getNumero());
        System.out.println("metodo Agencia: "+c2.getAgencia());
        System.out.println("identificador c2: "+c2.getIdentificador());
        
        
        if (c1 == c2){
          System.out.println("iguais c2");
        } else{
          System.out.println("diferentes c2");
        }
        if (c1.getTitular() == c2.getTitular()){
          System.out.println("iguais titular");
        } else{
          System.out.println("diferentes titular");
        } 
        
        
        //parte 5, fazendo c2 referenciar os mesmos objetos da variavel c1
        Conta c3 = new Conta();
        System.out.println("identificador c3: "+c3.getIdentificador());
        if (c1 == c3){
          System.out.println("iguais c3");
        } else{
          System.out.println("diferentes c3");
        }
        
        /*parte 6
        Data data = new Data();
        data.dia = 1;
        data.mes = 2;
        data.ano = 2015;
        c1.dataAbertura = data;
        data.ano = 2016;
        System.out.println(data.ano);
        System.out.println(c1.dataAbertura.ano);*/
        
        //contador 
        System.out.println("Contador " +Conta.getContador() + " contas");
    }
}
