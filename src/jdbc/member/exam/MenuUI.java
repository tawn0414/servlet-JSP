package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.board.exam.BoardDTO;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//�Ի����� ���� ��¥(sysdate�϶�� ��), point = 1000�� ���Եǵ��� �ϱ�.
		System.out.println("*******������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�н�����:");
		String pass = key.next();
		System.out.print("����:");
		String name = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		System.out.print("�μ���ȣ:");
		String deptno = key.next();
		MemberDTO member = new MemberDTO(id, pass, name, addr, deptno);
		int result = dao.insert(member);
		if(result>0) {
			System.out.println("�Խñ� ��� ����");
		}else {
			System.out.println("�� ��� ����");
		}
	}
	public void updateMenu(){//���̵� �Է¹޾Ƽ� �ּҺ���
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�ּ�:");
		String addr = key.next();
		int result = dao.update(id, addr);
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}else {
			System.out.println("�� ���� ����");
		}
	}
	public void deleteMenu(){//���̵� �Է¹޾Ƽ� ����
		System.out.println("*******�������********");
		System.out.print("���̵�:");
		String id = key.next();
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("�Խñ� ���� ����");
		}else {
			System.out.println("�� ���� ����");
		}

	}
	public void findByAddrMenu(){
		System.out.println("*******����˻�********");
		System.out.print("�ּ�:");
		String addr = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<MemberDTO> mem = dao.findByAddr(addr);
		int size = mem.size();
		for(int i = 0; i<size; i++) {
			MemberDTO board = mem.get(i);
			System.out.print("id:"+board.getId()+"\t");
			System.out.print("pass:"+board.getPass()+"\t");
			System.out.print("name:"+board.getName()+"\t");
			System.out.print("addr:"+board.getAddr()+"\t");
			System.out.print("deptno:"+board.getDeptno()+"\t");
			System.out.print("hiredate:"+board.getHiredate()+"\t");
			System.out.println("point:"+board.getPoint());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�����ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<MemberDTO> boardlist = dao.memberList();
		int size = boardlist.size();
		for(int i = 0; i<size;i++) {
			MemberDTO board = boardlist.get(i);
			System.out.print("id:"+board.getId()+"\t");
			System.out.print("pass:"+board.getPass()+"\t");
			System.out.print("name:"+board.getName()+"\t");
			System.out.print("addr:"+board.getAddr()+"\t");
			System.out.print("deptno:"+board.getDeptno()+"\t");
			System.out.print("hiredate:"+board.getHiredate()+"\t");
			System.out.println("point:"+board.getPoint());
		}
	}
	
	public void loginMenu() {
		System.out.println("*******�α���*********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("��й�ȣ:");
		String pass = key.next();
		MemberDTO result = dao.login(id, pass);
		if(result == null) {
			System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
		}else {
			System.out.println("�α��� ����");
		}
	}
}


















