package openapi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//xml������ �Ľ��ϴ� �۾�.
public class DomParserTest01 {
	public static void main(String[] args) throws Exception{
		//parser������
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//DOM parser
		DocumentBuilder domparser = factory.newDocumentBuilder();
		//parser�� parse�޼ҵ带 ȣ���ϸ� xml�� �м��ؼ� DOM��ü�� ���� ��ȯ
		Document document = domparser.parse("src/openapi/dept.xml");

		//root������Ʈ
		Element root = document.getDocumentElement(); 
		System.out.println(root.getNodeName()); // -> dept.xml�� deptlist�� �޾Ƴ�.
		
		//dept������Ʈ ����, NodeList -> arraylist��� ����, getLength() -> size��� ����
		NodeList nodelist = root.getElementsByTagName("dept");
		System.out.println(nodelist.getLength());
		for(int i=0 ; i<nodelist.getLength(); i++) { //dept.xml�� �ִ� �װ��� dept��带 ���. �ٸ��� �ϸ� �� dept��� ���� ������� ������ ���� �ִ�.
			Node node = nodelist.item(i);
			System.out.println("����:"+node.getNodeName());
		}
	
	}

}
