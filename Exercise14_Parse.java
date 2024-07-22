import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import java.io.File;

public class Exercise14_Parse {
    public static void main(String[] args) {
        try {
           
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(new File("library.xml"));

            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());

            NodeList bookList = doc.getElementsByTagName("Book");

            for (int i = 0; i < bookList.getLength(); i++) {
                Node bookNode = bookList.item(i);

                if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element bookElement = (Element) bookNode;

                   
                    String id = bookElement.getAttribute("id");
                    System.out.println("Book ID: " + id);

                    
                    String title = bookElement.getElementsByTagName("Title").item(0).getTextContent();
                    System.out.println("Title: " + title);

                   
                    String author = bookElement.getElementsByTagName("Author").item(0).getTextContent();
                    System.out.println("Author: " + author);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
