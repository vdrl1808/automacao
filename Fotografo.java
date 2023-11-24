
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vitor
 */
public class Fotografo {

    
    public static void tirarPrint(String suite, String teste, int iteracao) throws AWTException, IOException{
        
        
        Robot printar = new Robot();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Rectangle tamanhoDoPrint = new Rectangle((int) screenSize.getWidth(), (int) screenSize.getHeight());

        BufferedImage imagemBuffer = printar.createScreenCapture(tamanhoDoPrint);

        // Adiciona um timestamp ao nome do arquivo
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
        String timestamp = dateFormat.format(new Date());
        
        String diretorioImagem = "C:\\aut\\" + suite +"\\"+ teste +"\\"+ iteracao;
        String nomeImagem = "img_"+ suite+"_"+teste+"_"+iteracao+".png";
        
        String caminhoCompleto = diretorioImagem +"\\" + nomeImagem;
        
        File arquivoImg = new File( caminhoCompleto + timestamp + ".png");
        
        // parametrizar a imagem com os parametros que seram recebidos: suite/teste/iteração
        
        // Garante que o diretório existe antes de salvar o arquivo
        arquivoImg.getParentFile().mkdirs();

        
            ImageIO.write(imagemBuffer, "png", arquivoImg);
        
        
    }
}