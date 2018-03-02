package NonLinearDataStructure;

import java.util.Scanner;

public class BInaryTree {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter element you want to insert");
		int ele = scr.nextInt();
		Bt b=new Bt(); 
		b.insert(ele);
	}

	

}

class Node {
	Node left, right;
	int data;

	Node() {
		left = null;
		right = null;
		data = 0;
	}

	Node(int data) {
		left = null;
		right = null;
		this.data = data;
	}

	void setleft(Node n) {
		left = n;
	}

	void setright(Node n) {
		right = n;
	}

	Node getLeft() {
		return left;
	}

	Node getRight() {
		return right;
	}

	void setData(int data) {
		this.data = data;
	}

	int getData() {
		return data;
	}
}

class Bt {
	Node root;

	Bt() {
		root = null;
	}
	
	void insert(int data) {
		root=insert(root, data);
	}
	
	Node insert(Node root, int data ) {
		if(root==null)
			root=new Node(data);
		else {
			if((root.getRight()==null))
				root.right=insert(root.right, data);
			 else {
				root.left=insert(root.left, data);
			}
		}
		
		System.out.println("final tree");
		System.out.print(root.getLeft()+ " " + root.getData() + " " + root.getRight());
	
		return root;
		
	}
}
