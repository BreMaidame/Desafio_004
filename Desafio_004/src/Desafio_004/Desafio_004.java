
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
	  // Atualização: foram adicionados mais 2 alunos no array para teste
	  
    Aluno[] alunosArray = new Aluno[5];
    alunosArray[0] = new Aluno("Juramil Leal", 16, 4.7);
    alunosArray[1] = new Aluno("César de Souza", 18, 10.0);
    alunosArray[2] = new Aluno("Andressa Soares", 17, 8.0);
    alunosArray[3] = new Aluno("Tonho Almeida", 15, 2.0);
    alunosArray[4] = new Aluno("Giovana Partica", 16, 9.7);

    
    //"for" para somar as notas
    //Atualização: Foi adicionado também a soma da idade desses alunos ao array
    
    double somaNotasArray = 0;
    for (Aluno aluno : alunosArray) {
      somaNotasArray += aluno.nota;
    }
    
    double somaIdadesArray = 0;
    for(Aluno idade : alunosArray) {
    	somaIdadesArray += idade.idade;
    }
    
    //Print do resultado do array
    
    System.out.println("Soma das notas (array): " + somaNotasArray);
    System.out.println("Soma da idade dos alunos (array): " + somaIdadesArray);

    //Criação da Lista 
    //Atualização: Foram adicionados mais 2 alunos na lista para teste 
    
    List<Aluno> alunosList = new ArrayList<Aluno>();
    alunosList.add(new Aluno("Juramil Leal", 16, 4.7));
    alunosList.add(new Aluno("César de Souza", 18, 10.0));
    alunosList.add(new Aluno("Andressa Soares", 17, 8.0));
    alunosList.add(new Aluno("Juninho Cleversom", 88, 10.0));
    alunosList.add(new Aluno("Junessa Kyle", 7, 7.5));
    
    //Mesma lógica para a soma da Lista
    //Atualização: Foi adicionado o calculo da idade dos alunos

    double somaNotasList = 0;
    for (Aluno aluno : alunosList) {
      somaNotasList += aluno.nota;
    }
    double somaIdadesList = 0;
    for (Aluno idade : alunosList) {
    	somaIdadesList += idade.idade;
    }
    
    //Print do resultado da Lista
    
    System.out.println("Soma das notas (lista): " + somaNotasList);
    System.out.println("Soma da idade dos alunos (lista): " + somaIdadesList);
  }
}