/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.desafio.faturamento;

/**
 *
 * @author Tais
 */
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Faturamento {
  
 public static <Iterator> void main(String[] args) {
    double[] valores = new double[30];
    int dia = 0;
    int diaMaior = 0;
    int diaMenor = 0;
    int nulo = 0;
    double soma = 0.0;
    double media = 0.0;
    double maior = 0.0;
    double menor;

    ObjectMapper objectMapper = new ObjectMapper();
    System.out.println(" Dados Faturamento");
    System.out.println("----------------------------");
    
    try {
        Dados[] dados = objectMapper.readValue(new File(".\\src\\dados.json"), Dados[].class);
        int i = 0;
        
        for(Dados iterator : dados){
            valores[i] = iterator.getValor();
            System.out.println("Dia " + i + ": " + valores[i]);
            if(valores[i] != 0.0)
            {
                soma += valores[i];
            }
            else{
                nulo++;
            }
            i++;
        }
        
        System.out.println("Soma: " + soma);
        media = soma / (30 - nulo);
        System.out.println("Media: " + media);
        System.out.println("----------------------------");
        menor = soma;
        
        for(i = 0; i < valores.length; i++){
            if(valores[i] >= maior){
                maior = valores[i];
                diaMaior = i+1;
            }
            if(valores[i] != 0 && valores[i] <= menor)
            {
                menor = valores[i];
                diaMenor = i+1;
            }
            if(valores[i] > media)
            {
                dia++;
            }
        }

        System.out.println("Dia com o maior faturamento: " + diaMaior);
        System.out.println("Valor com o maior faturamento: " + maior);
        
        System.out.println("----------------------------");

        System.out.println("Dia com o menor faturamento: " + diaMenor);
        System.out.println("Valor com o menor faturamento: " + menor);
        
        System.out.println("----------------------------");

        System.out.println("Numero de dias com faturamento diario superior a media mensal: " + dia);


    } catch (JsonParseException e) {
        
        e.printStackTrace();
    } catch (JsonMappingException e) {
        
        e.printStackTrace();
    } catch (IOException e) {
        
        e.printStackTrace();
    }
 
 }
}
    

