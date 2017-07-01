class TestaConta{
    public static void main(String[] args){
        Conta c1= new Conta();
        
        c1.titular = "Daniel";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        //c1.dataAbertura = "09/06/2015";
               
        c1.deposita(100);
        System.out.println(c1.recuperaDadosParaImpressao());
        /* 
        A instrucao acima ja soma o novo saldo e rendimento
        System.out.println("Saldo atual: " + c1.saldo);
        System.out.println("Rendimento Mensal: " + c1.calculaRendimento());
        */
        
        /*parte 4 criando duas contas. referenciam objetos diferentes da classe,
        porem comparando atributis*/
        
        Conta c2 = new Conta();
        c2.titular = "Daniel";
        c2.numero = 123;
        c2.agencia = "45678-9";
        c2.saldo = 50.0;
        //c2.dataAbertura = "09/06/2015";
        if (c1 == c2){
          System.out.println("iguais c2");
        } else{
          System.out.println("diferentes c2");
        }
        if (c1.titular == c2.titular){
          System.out.println("iguais titular");
        } else{
          System.out.println("diferentes titular");
        } 
        
        //parte 5, fazendo c2 referenciar os mesmos objetos da variavel c1
        Conta c3 = c1;
        if (c1 == c3){
          System.out.println("iguais c3");
        } else{
          System.out.println("diferentes c3");
        }
        
        /*parte 6*/
        Data data = new Data();
        data.dia = 1;
        data.mes = 2;
        data.ano = 2015;
        c1.dataAbertura = data;
        data.ano = 2016;
        System.out.println(data.ano);
        System.out.println(c1.dataAbertura.ano);
    }
}
