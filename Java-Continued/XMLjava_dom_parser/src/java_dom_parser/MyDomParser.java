//READ XML

package java_dom_parser;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MyDomParser {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc =  builder.parse("XMLFIle.xml");
			NodeList studentList = doc.getElementsByTagName("student");
			for(int i=0;i<studentList.getLength();i++) {
				Node s = studentList.item(i);
				if(s.getNodeType()==Node.ELEMENT_NODE) {
					Element student = (Element) s;	
					String id = student.getAttribute("id");
					NodeList nameList = student.getChildNodes();
					for(int j=0;j<nameList.getLength();j++) {
						Node n = nameList.item(j);
						if(n.getNodeType()==Node.ELEMENT_NODE) {
							Element name = (Element) n;
							System.out.println("Student" + id + ":" + name.getTagName() + "=" + name.getTextContent());
						}				
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
 