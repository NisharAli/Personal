package com.nish;

public class Tree {

	public static boolean searchElement(Node root, int element){
		
		
			if (root != null) {

				// check if current node has the element we are looking for
				if (root.data == element) {
					return true;
				} else {
					// check if the sub trees
					return searchElement(root.left, element) || searchElement(root.right, element);
				}
			}
			return false;
		
	}
	
	
	public static void main(String [] args){
		
		Node root = new Node(2);
		root.left = new Node(7);
		root.right = new Node(5);
		root.left.left = new Node(2);
		root.left.right = new Node(6);
		root.left.right.left = new Node(5);
		root.left.right.right = new Node(11);
		root.right.right = new Node(9);
		root.right.right.left = new Node(4);
		
        System.out.println("Does tree has 5 : "+searchElement(root, 5));
        System.out.println("Does tree has 10 : "+searchElement(root, 10));
        System.out.println("Does tree has 19 : "+searchElement(root, 19));
        System.out.println("Does tree has 7 : "+searchElement(root, 7));
		
	}
	
}

class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data = data;
	}
	
}
