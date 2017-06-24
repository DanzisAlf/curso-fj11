class Exerc313 {
    public static void main(String[] args){
        //inicio;limite;incremento
        for(int i=150; i<=300; i++){
            System.out.println(i);
        }
        
        int i = 1;
        /*while(i<=1000){
            System.out.println(i);
            i++;
        }*/
        
        //soma ate 1000
        int soma = 0;
        for(i=1;i<=1000;i++){
            soma =soma + i;
            
        }
        System.out.println(soma);
        
        //multiplos de 3
        for(i=1; i<=100; i++){
            if(i % 3 == 0){
            System.out.println(i);
            }
        }
        
        //fatorial
        int fatorial= 1;
        for(i=1; i<=11; i++){
            if(i-1==0){
                System.out.println("O fatorial de (0!) é 1");
            }else{
                fatorial = (i-1)*fatorial;
                System.out.println("O fatorial de ("+(i-1)+"!) é "+fatorial);
            } 
        }
        
        //fibonacci
        int fibo=0;
        for(i=1; i<=11; i++){
            fibo=fibo+(i-1)+(i-2);
            System.out.println(fibo);
        }
    }
}
