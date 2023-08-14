package br.com.bigfamous.imersaojava;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;

public class GeradorDeFigurinhas {


    public void cria(InputStream inputStream, String nomeArquivo) throws Exception {

        BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));

        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 170;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 200, null);

        var fonte = new Font(Font.SANS_SERIF, Font.ITALIC, 100);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);

        graphics.drawString("**Um Clássico Perfeito**", 150, novaAltura - 150);


        ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));

    }

    public static void main(String[] args) throws Exception {
        var geradora = new GeradorDeFigurinhas();
        geradora.cria(null, null);

    }
}