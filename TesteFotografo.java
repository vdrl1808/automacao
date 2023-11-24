
import java.awt.AWTException;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class TesteFotografo {

    public static void main(String[] args) {
        try {
            // Chame o método tirarPrint com os parâmetros desejados
            Fotografo.tirarPrint("MinhaSuite", "MeuTeste", 1);
            System.out.println("Screenshot capturado com sucesso!");
        } catch (AWTException | IOException e) {
            e.printStackTrace();
            System.err.println("Erro ao capturar o screenshot.");
        }
    }
}

