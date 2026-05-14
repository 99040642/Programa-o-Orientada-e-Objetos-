package com.mycompany.conexao;

import java.sql.Connection;

public class Principal {
    public static void main(String[] args) {
        Conexao conexaoObj = new Conexao();
        Connection con = conexaoObj.conectar();
        
        if (con != null) {
            System.out.println("Conexão realizada com sucesso!");
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Erro ao fechar: " + e.getMessage());
            }
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }
    }
}
