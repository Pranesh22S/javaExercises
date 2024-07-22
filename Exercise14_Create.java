import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.File;

public class Exercise14_Create{
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();            
            Element rootElement = doc.createElement("Library");
            doc.appendChild(rootElement);
            Element book = doc.createElement("Book");
            rootElement.appendChild(book);
            book.setAttribute("id", "1");
            Element title = doc.createElement("Title");
            title.appendChild(doc.createTextNode("Java Programming"));
            book.appendChild(title);
            Element author = doc.createElement("Author");
            author.appendChild(doc.createTextNode("Pranesh"));
            book.appendChild(author);
            Element book2 = doc.createElement("Book");
            rootElement.appendChild(book2);
            book2.setAttribute("id", "2");
            Element title2 = doc.createElement("Title");
            title2.appendChild(doc.createTextNode("Advanced Java"));
            book2.appendChild(title2); 
            Element author2 = doc.createElement("Author");
            author2.appendChild(doc.createTextNode("Pranesh Samidurai"));
            book2.appendChild(author2);
            
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("library.xml"));
            transformer.transform(source, result);
            System.out.println("XML file created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
