
package Desafio_004;


import java.util.ArrayList;
import java.util.List;

class Aluno {
  String nome;
  int idade;
  double nota;

  Aluno(String nome, int idade, double nota) {
    this.nome = nome;
    this.idade = idade;
    this.nota = nota;
  }
}

public class Desafio_004 {
  public static void main(String[] args) {
	  
	  // Aqui é aberto o array para definir os valores dos alunos
	  
    Aluno[] alunosArray = new Aluno[3];
    alunosArray[0] = new Aluno("Juramil Leal", 16, 4.7);
    alunosArray[1] = new Aluno("César de Souza", 18, 10.0);
    alunosArray[2] = new Aluno("Andressa Soares", 17, 8.0);

    
    //"for" para somar as notas
    
    double somaNotasArray = 0;
    for (Aluno aluno : alunosArray) {
      somaNotasArray += aluno.nota;
    }
    
    //Print do resultado do array
    
    System.out.println("Soma das notas (array): " + somaNotasArray);

    //Criação da Lista 
    
    List<Aluno> alunosList = new ArrayList<Aluno>();
    alunosList.add(new Aluno("Juramil Leal", 16, 4.7));
    alunosList.add(new Aluno("César de Souza", 18, 10.0));
    alunosList.add(new Aluno("Andressa Soares", 17, 8.0));
    
    //Mesma lógica para a soma da Lista

    double somaNotasList = 0;
    for (Aluno aluno : alunosList) {
      somaNotasList += aluno.nota;
    }
    
    //Print do resultado da Lista
    
    System.out.println("Soma das notas (lista): " + somaNotasList);
  }
}