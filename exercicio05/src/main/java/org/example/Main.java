package org.example;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // instancia documento pdf
        PDDocument documento = new PDDocument();
        // instancia página em branco
        PDPage pagina = new PDPage();
        // adiciona página no documento
        documento.addPage(pagina);

        Scanner leitor = new Scanner(System.in);
        String name = leitor.nextLine();

        // escritor
        PDPageContentStream escritor = new PDPageContentStream(documento, pagina);
        PDType1Font fonte = new PDType1Font(Standard14Fonts.FontName.TIMES_BOLD);
        escritor.setFont(fonte, 15.5f);

        escritor.beginText();

        escritor.newLineAtOffset(100, 700);

        escritor.showText(name);

        escritor.newLineAtOffset(10, -100);

        escritor.showText("ola mundoooo!");


        escritor.endText();
        escritor.close();

        //salva o documento
        documento.save("teste.pdf");

    }

}