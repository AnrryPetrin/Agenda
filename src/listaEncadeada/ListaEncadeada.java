package listaEncadeada;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ListaEncadeada {
    public IntNoSimples primeiro, ultimo;
    int numero_nos=0;
    
    public ListaEncadeada(){
        primeiro = ultimo = null;   
    }
    public void insereNo_fim (IntNoSimples novoNo){
	novoNo.prox = null;
        if (primeiro == null)
            primeiro = novoNo;
	if (ultimo != null)
            ultimo.prox = novoNo;
        ultimo = novoNo;
	numero_nos++;
    }
    public void insereNo_inicio (IntNoSimples novoNo){
        novoNo.prox = primeiro;
	if(primeiro == null && ultimo==null) //Só tem um elemento na lista
        {
            ultimo = novoNo;
	}
	primeiro = novoNo;
        numero_nos++;
    }
    public int contarNos(){
	int tamanho = 0;
        IntNoSimples temp_no = primeiro;
    	while (temp_no != null)
        {   tamanho++;
            temp_no = temp_no.prox;
	}
        return tamanho;
    }
    public void insereNo_posicao(IntNoSimples novoNo, int posicao){
	IntNoSimples temp_no = primeiro;
	int numero_nos = contarNos();
	int pos_aux;
	if(posicao == 0)
	{
            novoNo.prox = primeiro;
            if(primeiro == ultimo)
            {
                ultimo = novoNo;
            }
            primeiro = novoNo;
        }
        else
	{
            if (posicao <= numero_nos)
            {   
		pos_aux = 1;
		while(temp_no != null && posicao > pos_aux)
		{
                    temp_no = temp_no.prox;
                    pos_aux ++;
                }
                novoNo.prox = temp_no.prox;
                temp_no.prox = novoNo;
            }
            else
            {
                if(posicao > numero_nos)
		{
                    ultimo.prox = novoNo;
                    ultimo = novoNo;
		}
            }	 
        }
    }


    public IntNoSimples buscaNo (int buscaValor){
        int i = 0;
        IntNoSimples temp_no = primeiro;
        while (temp_no != null)
        {
            if (temp_no.valor == buscaValor)
            {
                JOptionPane.showMessageDialog(null, "No " + temp_no.valor + " posição " + i);
                return temp_no;	
            }
            i++;
            temp_no = temp_no.prox;
        }
        return null;
    }

    public void excluiNo (int valor){
        IntNoSimples temp_no = primeiro;
        IntNoSimples anterior_no=null;
        while (temp_no != null && temp_no.valor != valor){
            anterior_no = temp_no;
            temp_no = temp_no.prox;
        }
        if (temp_no == primeiro){
            if (temp_no.prox !=null)
                primeiro = temp_no.prox;
            else
                primeiro = null;
        }
        else{
            anterior_no.prox =temp_no.prox;
        }
        
        if (ultimo == temp_no)
            ultimo = anterior_no;
    }

    public String exibeLista(){
        String message = "";
        IntNoSimples temp_no = primeiro;
        int i = 0;
        while (temp_no != null)
        {
            message += temp_no.valor + " min - " + temp_no.titulo + " - " + temp_no.prioridade + "<br><br>";
            temp_no = temp_no.prox;
            i++;
        }
        return message;
    }
    
    public void bubbleSort() {
        // Se a lista for menor que 2 o método é encerrado
        if (this.contarNos() < 2) {
            this.exibeLista();
            return;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Baixa", 1);
        hashMap.put("Média", 2);
        hashMap.put("Alta", 3);
        
        // Nó que percorrerá a lista
        IntNoSimples currentNode = this.primeiro;
        // Caso o parâmetro reverse seja selecionado como true então o algoritmo reordenará a lista pelo maior valor
  
            // os "for" alinhados permitem que a lista seja percorrida até que ela seja reordenada completamente. 
            // Complexidade O(n^2)
            
        for(int r = 0; r < this.contarNos(); r++) {          
            for(int c = 0; c < this.contarNos(); c++) {
                // Condição que verifica se o próximo valor é maior que o atual. Se sim, eles trocam de posição
                if (hashMap.get(currentNode.prioridade) < hashMap.get(currentNode.prox.prioridade)) {

                    int auxValor = currentNode.valor;
                    String auxTitulo = currentNode.titulo;
                    String auxPrioridade = currentNode.prioridade;
                    
                    currentNode.valor = currentNode.prox.valor;
                    currentNode.titulo = currentNode.prox.titulo;
                    currentNode.prioridade = currentNode.prox.prioridade;
                    
                    currentNode.prox.valor = auxValor;  
                    currentNode.prox.titulo = auxTitulo; 
                    currentNode.prox.prioridade = auxPrioridade; 
                }
                // Variável recebe o próximo nó. Caso o próximo nó seja null então a variável recebe o primeiro nó novamente
                currentNode = currentNode.prox; 
                if (currentNode.prox == null) {
                    currentNode = this.primeiro;
                }
            }
        }
        
        for(int r = 0; r < this.contarNos(); r++) {          
            for(int c = 0; c < this.contarNos(); c++) {
                // Condição que verifica se o próximo valor é maior que o atual. Se sim, eles trocam de posição
                if (currentNode.valor > currentNode.prox.valor && Objects.equals(hashMap.get(currentNode.prioridade), hashMap.get(currentNode.prox.prioridade))) {

                    int auxValor = currentNode.valor;
                    String auxTitulo = currentNode.titulo;
                    String auxPrioridade = currentNode.prioridade;
                    
                    currentNode.valor = currentNode.prox.valor;
                    currentNode.titulo = currentNode.prox.titulo;
                    currentNode.prioridade = currentNode.prox.prioridade;
                    
                    currentNode.prox.valor = auxValor;  
                    currentNode.prox.titulo = auxTitulo; 
                    currentNode.prox.prioridade = auxPrioridade;                
                }
                // Variável recebe o próximo nó. Caso o próximo nó seja null então a variável recebe o primeiro nó novamente
                currentNode = currentNode.prox; 
                if (currentNode.prox == null) {
                    currentNode = this.primeiro;
                }
            }
        }

    }
        

     
}
