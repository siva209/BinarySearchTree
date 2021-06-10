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
	
	@Test
	 public void givenThirteenIntegers_whenAdded_shouldReturnSizeAsThirteen() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(3);
		binarySearchTree.add(11);
		binarySearchTree.add(63);
		binarySearchTree.add(16);
		binarySearchTree.add(65);
		binarySearchTree.add(67);
		assertEquals(13, binarySearchTree.size());
	}
	
	@Test
	 public void givenABinaryTree_whenSearchedForElement_shouldReturnTrueIfPresent() {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.add(56);
		binarySearchTree.add(30);
		binarySearchTree.add(70);
		binarySearchTree.add(22);
		binarySearchTree.add(40);
		binarySearchTree.add(60);
		binarySearchTree.add(95);
		binarySearchTree.add(3);
		binarySearchTree.add(11);
		binarySearchTree.add(63);
		binarySearchTree.add(16);
		binarySearchTree.add(65);
		binarySearchTree.add(67);
		assertEquals(true, binarySearchTree.search(63));
	}	
}


