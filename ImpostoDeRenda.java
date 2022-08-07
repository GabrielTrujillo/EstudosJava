//Exercicio para Deducao de Imposto de Renda, Utilizando Apenas IFs
public class ImpostoDeRenda {

    public static void main(String[] args) {

        double salario = 6400;
        double impostoRenda = 0; //Variavel que Armazenara o Valor do Imposto de Renda
        float deducao = 0;
        float aliquota = 0;
        //ifs aqui
        
        if (salario < 1903.99) {
        	impostoRenda = 0;        	
        } else {
        	if (salario < 2826.66) {
        		//float deducao = 142.80f;
            	//float aliquota = 0.075f;		
        		deducao = 142.80f;
        		aliquota = 0.075f;
        		impostoRenda = (salario * aliquota) - deducao;
        	} else {
        		if(salario < 3751.06) {
        			//float deducao = 354.80f;
                	//float aliquota = 0.15f;		
        			deducao = 354.80f;
        			aliquota = 0.15f;
        			impostoRenda = (salario * aliquota) - deducao;
        		} else {
        			if(salario < 4664.68) {
        				//float deducao = 636.13f;
                    	//float aliquota = 0.225f;		
        				deducao = 636.13f;
        				aliquota = 0.225f;
        				impostoRenda = (salario * aliquota) - deducao;
        			} else {
        				//float deducao = 869.36f;
                    	//float aliquota = 0.275f;		
        				deducao = 869.36f;
        				aliquota = 0.275f;
        				impostoRenda = (salario * aliquota) - deducao;
        			}
        		}
        	}
        }
        
        System.out.printf("Sua Aliquota eh de %.1f%% e sua deducao eh de %.2f \n", aliquota*100, deducao);
        
        System.out.printf("O valor do seu imposto de renda eh %.2f", impostoRenda);
    
    }
}
