//WRITE XML

package java_dom_parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteXMLDom {

    public static void main(String[] args)
            throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Club");
        doc.appendChild(rootElement);

       Element player =  doc.createElement("player");
        rootElement.appendChild(player);
        player.setAttribute("id","10");
        Element name = doc.createElement("name");
        name.setTextContent("Messi");
        player.appendChild(name);
        Element role = doc.createElement("role");
        role.setTextContent("Right-Winger");
        player.appendChild(role);
        

        Element player1 =  doc.createElement("player");
         rootElement.appendChild(player1);
         player1.setAttribute("id","11");
         Element name1 = doc.createElement("name");
         name1.setTextContent("Neymar");
         player1.appendChild(name1);
         Element role1 = doc.createElement("role");
         role1.setTextContent("Left-Winger");
         player1.appendChild(role1);
       

        // write dom document to a file
        try (FileOutputStream output =
                     new FileOutputStream("F:\\FYP\\player-dom.xml")) {
            writeXml(doc, output);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // write doc to output stream
    private static void writeXml(Document doc,
                                 OutputStream output)
            throws TransformerException {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);

        transformer.transform(source, result);

    }
}