package com.java.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.java.binarysearch.BinaryNode;
import com.java.binarysearch.BinarySearchTree;

public class BinarySearchTreeTest {
	@Test
	 public void givenThreeIntegers_whenAdded_shouldReturnSizeAsThree() {
		BinaryNode<Integer> firstNode = new BinaryNode<Integer>(56);
		BinaryNode<Integer> secondNode = new BinaryNode<Integer>(30);
		BinaryNode<Integer> thirdNode = new BinaryNode<Integer>(70);
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.add(firstNode.key);
		binarySearchTree.add(secondNode.key);
		binarySearchTree.add(thirdNode.key);
		assertEquals(3, binarySearchTree.size());
	}
}

