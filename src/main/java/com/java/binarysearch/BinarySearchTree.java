package com.java.binarysearch;

public class BinarySearchTree<E extends Comparable<E>> {
	private BinaryNode<E> root;
	public BinarySearchTree(){
		this.root = null;	
	}
	public void add(E data) {
		this.root = this.addNode(root, data); 	
	}
	
	private BinaryNode<E> addNode(BinaryNode<E> current, E data) {
		if(current == null) {
			return new BinaryNode<E>(data);
		}
		else if(current.key.compareTo(data)>0) {
			current.leftNode = addNode(current.leftNode, data);
		}
		else
		{
			current.rightNode = addNode(current.rightNode, data);
		}
		return current;
	}
	public int size() {
		return this.getSize(root);
	}
	public int getSize(BinaryNode<E> current) {
		return current == null ? 0 : 1 + this.getSize(current.leftNode) + this.getSize(current.rightNode);
	}
}


