package openapi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
//xml문서를 파싱하는 작업.
public class DomParserTest01 {
	public static void main(String[] args) throws Exception{
		//parser생성기
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//DOM parser
		DocumentBuilder domparser = factory.newDocumentBuilder();
		//parser의 parse메소드를 호출하면 xml을 분석해서 DOM객체로 만들어서 변환
		Document document = domparser.parse("src/openapi/dept.xml");

		//root엘리먼트
		Element root = document.getDocumentElement(); 
		System.out.println(root.getNodeName()); // -> dept.xml의 deptlist를 받아냄.
		
		//dept엘리먼트 추출, NodeList -> arraylist라고 생각, getLength() -> size라고 생각
		NodeList nodelist = root.getElementsByTagName("dept");
		System.out.println(nodelist.getLength());
		for(int i=0 ; i<nodelist.getLength(); i++) { //dept.xml에 있는 네개의 dept노드를 출력. 다르게 하면 각 dept노드 안의 내용들을 가져올 수도 있다.
			Node node = nodelist.item(i);
			System.out.println("노드명:"+node.getNodeName());
		}
	
	}

}
