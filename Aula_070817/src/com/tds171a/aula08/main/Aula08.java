package com.tds171a.aula08.main;

import java.util.Date;

import com.tds171a.aula08.pessoa.Pessoa;
import com.tds171a.aula08.utilitario.Leitor;

public class Aula08
{

    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        Pessoa pessoa = montarPessoa();

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
    }

    public static Pessoa montarPessoa() {
        String nome = Leitor.readString("Entre com um nome...........................:");
        String sexo = Leitor.readString("Entre com seu sexo..........................:");
        String data = Leitor.readString("Entre com sua data de nascimento(dd/mm/aaaa):");

//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome(nome);
//        pessoa.setSexo(sexo);
//        pessoa.setDataNascimento(new Date(data));
//
//        return pessoa;

        return new Pessoa(nome, sexo, new Date(data));
    }
}
