programa
{

 inclua biblioteca Matematica --> mat // Inclui a blibioteca Matemática
 
 funcao inicio()
	{
	real a, b, c, delta, x1, x2
	
escreva("Digite os valores dos coeficientes: \n")
escreva("Digite o valor de a?")
leia(a)
    
escreva("Digite o valor de b?")
leia(b)

escreva("Digite o valor de c?")
leia(c)
     
delta = b*b - 4.0*a*c
se(delta < 0.0){
	escreva("não existem raizes reais")
	}
 	 senao { 
x1 = (-1.0*b + mat.raiz (delta, 2.0))/(2*a)
x2 = (-1.0*b - mat.raiz (delta, 2.0))/(2*a)
 	 	
escreva("\n x1 =", x1, "\n")
escreva("x2 =", x2, "\n")
 	 }
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 567; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */